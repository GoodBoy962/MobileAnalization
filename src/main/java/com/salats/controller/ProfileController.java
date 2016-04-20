package com.salats.controller;

import com.salats.service.UserService;
import com.salats.utils.SecurityUtils;
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
    UserService userService;

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String getIndexPage(Model model) {
        model.addAttribute("user", SecurityUtils.getCurrentUser());
        model.addAttribute("info", userService.getInfoByCurrentUser());
        return "index";
    }

}
