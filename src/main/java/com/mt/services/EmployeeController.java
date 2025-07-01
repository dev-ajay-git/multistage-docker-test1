package com.mt.services;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/")
    public String home() {
        return "home";  // loads home.jsp
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("employees", new String[]{"Ajay", "Sohan", "Mohan"});
        return "list";  // loads list.jsp
    }
}
