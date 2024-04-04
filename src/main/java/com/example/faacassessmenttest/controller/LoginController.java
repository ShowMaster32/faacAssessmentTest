package com.example.faacassessmenttest.controller;

import com.example.faacassessmenttest.model.User;
import com.example.faacassessmenttest.repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
@Configuration
@EnableWebMvc
@ComponentScan("com.example")
public class LoginController implements WebMvcConfigurer {

    @Autowired
    UserRepository userRepository;
    private static final Logger log = LoggerFactory.getLogger(LoginController.class);

    public LoginController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @GetMapping("/login")
    @Operation(summary = "Ritorna la login page - GET", description = "Pagina login dell'applicazione")
    public String showLoginPage() {
        log.debug("Login page handler called.");
        // return the name of the view
        return "login";
    }

    @PostMapping("/login")
    @Operation(summary = "Ritorna la login page - POST", description = "Pagina login dell'applicazione")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session,
                        Model model) {
        User userDao = new User();
        userDao.setUsername(username);
        userRepository.save(userDao);

        log.info("Utente {} salvato!", userRepository.findByUsername(userDao.getUsername()).getUsername());
        model.addAttribute("savedUserMessage", "Utente \"" + userDao.getUsername() + "\" salvato!");
        session.setAttribute("username", username);

        return "login";
    }
}