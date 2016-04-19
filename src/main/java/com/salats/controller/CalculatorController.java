package com.salats.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by aleksandrpliskin on 19.04.16.
 */
@Controller
@RequestMapping("calculator")
public class CalculatorController {

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String getSearchPage() {
        return "search";
    }

    @RequestMapping(value = "search", method = RequestMethod.POST)
    public String searchTarifs(HttpServletRequest request) {
        Map map = request.getParameterMap();
        String[] operators = (String[]) map.get("operators[]");
        String[] duration = (String[]) map.get("duration");
        String[] byRussian = (String[]) map.get("by_russia");
        String[] internet = (String[]) map.get("internet");
        String[] sms = (String[]) map.get("sms");
        
        return "search";
    }

}
