package com.salats.controller;

import com.salats.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by aleksandrpliskin on 20.04.16.
 */
@Controller
public class UserInfoController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "userInfo", method = RequestMethod.GET)
    public String getUserInfo(Model model) {
        model.addAttribute("info", userService.getInfoByCurrentUser());
        return "userInfoTest";
    }

}
