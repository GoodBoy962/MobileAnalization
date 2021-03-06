package com.salats.controller;

import com.salats.service.ProviderResponseParser;
import com.salats.service.UserService;
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
 * Created by aleksandrpliskin on 20.04.16.
 */
@Controller
public class UserInfoController {

    @Autowired
    UserService userService;

    @Autowired
    ProviderResponseParser parser;

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchTarifs(Model model) throws IOException {
        List<Tariff> tariff = parser.parse(userService.getInfoByCurrentUser());
        model.addAttribute("tariffs", tariff);
        return "results";
    }

}
