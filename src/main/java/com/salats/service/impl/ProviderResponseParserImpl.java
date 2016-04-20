package com.salats.service.impl;

import com.salats.service.ProviderResponseParser;
import com.salats.service.UnlimTarrifsRequestCreateService;
import com.salats.utils.Tariff;
import com.salats.utils.UserInfo;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by paradise on 19.04.16.
 */
@Service
public class ProviderResponseParserImpl implements ProviderResponseParser {

    @Value("${provider.calculator}")
    private String providerCalculatorUrl;

    @Value("${provider.root}")
    private String providerRoot;

    @Autowired
    UnlimTarrifsRequestCreateService requestCreateService;

    @Override
    public List<Tariff> parse(UserInfo userInfo) throws IOException {
        String params = requestCreateService.createRequest(userInfo);
        Document doc = Jsoup.connect(providerCalculatorUrl + params).get();
        Elements tariffs = doc.getElementsByClass("tariff");

        List<Tariff> response = new ArrayList<>();
        for (Element t : tariffs) {
            Tariff tariff = new Tariff();
            String link = providerRoot + t.select(".header").get(0).children().get(0).attr("href");
            tariff.setLink(link);
            List<String> features = t.select(".features").get(0).children().get(0).children()
                    .stream()
                    .map(Element::text)
                    .collect(Collectors.toList());
            tariff.setFeatures(features);
            response.add(tariff);
        }
        return response;
    }

}
