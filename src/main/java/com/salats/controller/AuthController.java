package com.salats.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by neil on 20.04.16.
 */
@Controller
public class AuthController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/")
    public String getProfilePage(HttpServletRequest request) {
        if (request.isUserInRole("ROLE_USER")) {
            return "redirect:/profile";
        }
        return "login";
    }

}