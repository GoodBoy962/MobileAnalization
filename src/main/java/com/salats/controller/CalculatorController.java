package com.salats.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

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
    public String searchTarifs(HttpServletRequest request, Model model) {
        Map map = request.getParameterMap();
        String[] operators = (String[]) map.get("operators[]");
        String[] duration = (String[]) map.get("duration");
        String[] byRussian = (String[]) map.get("by_russia");
        String[] internet = (String[]) map.get("internet");
        String[] sms = (String[]) map.get("sms");
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://unlimtariffs.ru/calculator/?operators%5B%5D=1&operators%5B%5D=3&operators%5B%5D=4&operators%5B%5D=5&duration=1&by_russia=1&internet=2&sms=2.json", String.class);
        model.addAttribute("r_body", responseEntity.toString());
        return "results";
    }

}
