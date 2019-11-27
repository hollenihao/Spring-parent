package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author Charlie
 */
@Controller
public class LoginController {
@GetMapping("/login")
    public String demo(){

    return "login";
}
@PostMapping("/login")
    public String demo(String username, HttpSession session){
    // username要跟AuthenticationInterceptor中session（会话）getAttibute一样
    if ("admin".equalsIgnoreCase(username)){
        session.setAttribute("username",username);
        return "index";
    }else{
        return "redirect:login";
    }
}
}
