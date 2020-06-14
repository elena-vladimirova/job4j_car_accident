package ru.job4j.police.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.police.model.Accident;
import ru.job4j.police.repository.AccidentMem;

@Controller
public class IndexControl {
    @GetMapping("/")
    public String index(Model model) {
        AccidentMem as = new AccidentMem();
        as.add(1, new Accident(1, "ДТП", "Произошла авария", "Смоленская площадь"));
        as.add(2, new Accident(2, "Разлив топлива", "Разлилось топливо", "Норильск"));
        model.addAttribute("accidents", as.getAccidents());
        return "index";
    }
}
