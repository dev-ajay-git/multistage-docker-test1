package com.mt.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {
    private List<String> employees = new ArrayList<>();

    @GetMapping("/")
    public String showForm() {
        return "home";
    }

    @PostMapping("/add")
    public String addEmployee(@RequestParam String name, Model model) {
        employees.add(name);
        model.addAttribute("employees", employees);
        return "list";
    }

    @GetMapping("/list")
    public String listEmployees(Model model) {
        model.addAttribute("employees", employees);
        return "list";
    }
}
