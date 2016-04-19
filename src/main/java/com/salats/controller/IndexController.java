package com.salats.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by aleksandrpliskin on 19.04.16.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndexPage() {
        return "index";
    }

}
