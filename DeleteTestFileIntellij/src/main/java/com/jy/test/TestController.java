package com.jy.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@PropertySource("classpath:/config/config.properties")
public class TestController {

    @Autowired
    private TestService service;

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    @GetMapping("/test")
    public String test(Model model) {

        System.out.println("username : " + username);
        System.out.println("passwrod " + password);

        model.addAttribute("username", username);
        model.addAttribute("password", password);

        model.addAttribute("name", "이재용");
        model.addAttribute("vo", service.selBoard());
        return "test";
    }
}
