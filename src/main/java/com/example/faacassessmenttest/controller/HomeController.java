package com.example.faacassessmenttest.controller;

import com.example.faacassessmenttest.endpoint.UserEndpoint;
import com.example.faacassessmenttest.request.UserRequest;
import com.example.faacassessmenttest.response.UserResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    UserEndpoint userEndpoint;

    @GetMapping("/")
        public String home(HttpSession session, Model model) {
            String username = (String) session.getAttribute("username");
            if (username != null) {
                UserRequest request = new UserRequest();
                request.setUsername(username);
                UserResponse userResponse = userEndpoint.getUser(request);
                model.addAttribute("welcomeMessage", userResponse.getMessage());
            }
            return "home";
    }

}