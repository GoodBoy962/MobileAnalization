package com.salats.controller;

import com.salats.service.ProviderResponseParser;
import com.salats.utils.Tariff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * Created by aleksandrpliskin on 19.04.16.
 */
@Controller
@RequestMapping("calculator")
public class CalculatorController {

    @Autowired
    private ProviderResponseParser parser;

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String getSearchPage() {
        return "search";
    }

    @RequestMapping(value = "search", method = RequestMethod.POST)
    public String searchTarifs(HttpServletRequest request, Model model) throws IOException {
        List<Tariff> tariff = parser.parse(request);
        model.addAttribute("tariffs", tariff);
        return "results";
    }

}
