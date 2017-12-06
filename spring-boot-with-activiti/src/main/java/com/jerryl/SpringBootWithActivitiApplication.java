package com.jerryl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@ComponentScan({"com.jerryl", "org.activiti"})
@Controller
public class SpringBootWithActivitiApplication {
    @RequestMapping(value = "/csrf/_csrf", method = RequestMethod.GET)
    public String _csrf(Model model) {
        return "_csrf";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWithActivitiApplication.class, args);
    }
}
