package com.example.poker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class SimpleController {

    @RequestMapping("websocket")
    public String getWebSocket() {
        return "index";
    }
}
