package com.example.usingws.controller;

import com.example.usingws.dto.User;
import com.example.usingws.repository.UserRepository;
import jakarta.servlet.http.HttpSession;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.Optional;

@Controller
@RequestMapping("/user")
@Log4j2
public class UserController {
    UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/test.do")
    public String test(){
        return "/user/test";
    }

//    @GetMapping("/login.do")
//    public String login(){return "/user/login"; }
//
//    @PostMapping("/login.do")
//    public String login(User user,
//                        HttpSession session){
//        Optional<User> accessUser = userRepository.findByUserIdAndUserPw(user.getUserId(), user.getUserPw());
//        if (accessUser.isPresent()){
//            session.setAttribute("loginUser", user);
//            return "redirect:/";
//        }else{
//            return "redirect:/user/login.do";
//        }
//    }
//    @PostMapping("/logout.do")
//    public String logout(User user,
//                         @SessionAttribute User loginUser,
//                         HttpSession session){
//        session.removeAttribute("loginUser");
//        return "redirect:/";
//    }
//
//    @GetMapping("/signup.do")
//    public String signup(){
//        return "/user/signup";
//    }
//
//    @PostMapping("/signup.do")
//    public String signup(User user,
//                         @SessionAttribute(required = false) User loginUser,
//                         HttpSession session){
//        if(!userRepository.existsById(user.getUserId())){
//            User newUser = userRepository.save(user);
//            log.info("Trying Sign Up " + newUser);
//            if (loginUser != null){
//                session.removeAttribute("loginUser");
//            }
//        return "redirect:user/login.do";
//        }else{
//            return "redirect:user/signup.do";
//        }
//    }


}
