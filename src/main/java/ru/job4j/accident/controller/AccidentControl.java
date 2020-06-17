package ru.job4j.accident.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentMem;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AccidentControl {

    private final AccidentMem accidents;

    public AccidentControl() {
        this.accidents = IndexControl.getAm();
    }

    public AccidentControl(AccidentMem accidents) {
        this.accidents = accidents;
    }

    public AccidentMem getAccidents() {
        return accidents;
    }

    @GetMapping("/create")
    public String create() {
        return "accident/create";
    }

    @GetMapping("/edit")
    public String edit() {
        return "accident/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Accident accident) {
        accident.setId(60);
        accidents.add(60, accident);
        return "redirect:/";
    }
}
