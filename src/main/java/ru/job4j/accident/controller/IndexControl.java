package ru.job4j.accident.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.accident.repository.AccidentJdbcTemplate;
import ru.job4j.accident.repository.AccidentMem;

@Controller
public class IndexControl {

/*    private static AccidentMem am = new AccidentMem();

    public static AccidentMem getAm() {
        return am;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("accidents", am.getAccidents());
        return "index";
    }*/

    private final AccidentJdbcTemplate accidents;

    public IndexControl(AccidentJdbcTemplate accidents) {
        this.accidents = accidents;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("accidents", accidents.getAll());
        return "index";
    }

}
