package com.example.usingws.controller;

import com.example.usingws.dto.User;
import jakarta.servlet.http.HttpSession;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@Log4j2
public class ChatController {
    @GetMapping("/chat")
    public String charGET(@SessionAttribute(required = false) User loginUser,
                          Model model){
        log.info("@ChatController, chat Get()");
        String user = "";
        if(loginUser != null){
            user = loginUser.getUserId();
        }else{
            user = "Unknown";
        }
        model.addAttribute("user", user);
        return "chat/chat";
    }
}
