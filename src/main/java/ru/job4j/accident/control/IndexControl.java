package ru.job4j.accident.control;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@Controller
public class IndexControl {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("user", "Elena");
        model.addAttribute("numbers", List.of("1", "2", "3"));
        return "index";
    }
}
