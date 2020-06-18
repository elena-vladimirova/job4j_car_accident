package ru.job4j.accident.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.job4j.accident.config.JdbcConfig;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentJdbcTemplate;
import ru.job4j.accident.repository.AccidentMem;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AccidentControl {

/*    private final AccidentMem accidents;

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

    @GetMapping("/update")
    public String update(@RequestParam("id") int id, Model model) {
        model.addAttribute("accident", accidents.getAccidents().get(id));
        return "accident/update";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Accident accident) {
        accidents.add(accident.getId(), accident);
        return "redirect:/";
    }*/

    private final AccidentJdbcTemplate accidents;

    public AccidentControl(AccidentJdbcTemplate accident) {
        this.accidents = accident;
    }

    @GetMapping("/create")
    public String create() {
        return "accident/create";
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") int id, Model model) {
        model.addAttribute("accident", accidents.getById(id));
        return "accident/update";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Accident accident) {
        accidents.save(accident);
        return "redirect:/";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Accident accident) {
        accidents.update(accident);
        return "redirect:/";
    }

}
