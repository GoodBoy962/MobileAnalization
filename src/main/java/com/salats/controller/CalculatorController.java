package com.salats.controller;

import com.salats.service.UnlimTarrifsRequestCreateService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    UnlimTarrifsRequestCreateService requestCreateService;

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String getSearchPage() {
        return "search";
    }

    @RequestMapping(value = "search", method = RequestMethod.POST)
    public String searchTarifs(HttpServletRequest request, Model model) {
        String params = requestCreateService.createRequest(request);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://unlimtariffs.ru/calculator/"+params+".json", String.class);
//        responseEntity.getBody()
        model.addAttribute("r_body", responseEntity.toString());
        return "results";
    }

}
