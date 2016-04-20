package com.salats.controller;

import com.salats.service.PlainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by aleksandrpliskin on 19.04.16.
 */
@Controller
public class ProfileController {

    @Autowired
    PlainService plainService;

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String getIndexPage(Model model) {
        return "index";
    }

}
