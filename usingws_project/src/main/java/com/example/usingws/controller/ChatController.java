package com.example.usingws.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class ChatController {
    @GetMapping("/chat")
    public String charGET(){
        log.info("@ChatController, chat Get()");

        return "chat/chat";
    }
}
