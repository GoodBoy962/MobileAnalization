package com.salats.service.impl;

import com.salats.service.UnlimTarrifsRequestCreateService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by aleksandrpliskin on 19.04.16.
 */
@Service
public class UnlimTarrifsRequestCreateServiceImpl implements UnlimTarrifsRequestCreateService {
    @Override
    public String createRequest(HttpServletRequest request) {
        String result = "?";
        Map map = request.getParameterMap();
        String[] operators = (String[]) map.get("operators[]");
        String[] duration = (String[]) map.get("duration");
        String[] byRussian = (String[]) map.get("by_russia");
        String[] internet = (String[]) map.get("internet");
        String[] sms = (String[]) map.get("sms");
        RestTemplate restTemplate = new RestTemplate();
        String requestParams = "";//TODO
        for (String operator : operators) {
            result += "operators%5B%5D=" + operator + "&";
        }
        result += "duration=" + duration[0] + "&" + "by_russia=" + byRussian[0] + "&internet=" + internet[0] + "sms=" + sms[0];
        return result;
    }
}
