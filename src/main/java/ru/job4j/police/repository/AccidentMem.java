package ru.job4j.police.repository;

import ru.job4j.police.model.Accident;
import java.util.HashMap;
import java.util.Map;

public class AccidentMem {

    private HashMap<Integer, Accident> accidents = new HashMap();

    public HashMap<Integer, Accident> getAccidents() {
        return accidents;
    }

    public void setAccidents(HashMap<Integer, Accident> accidents) {
        this.accidents = accidents;
    }

    public Accident add(Integer id, Accident accident) {
        return accidents.put(id, accident);
    }

    public static void main(String[] args) {
        AccidentMem as = new AccidentMem();
        as.add(1, new Accident(1, "ДТП", "Произошла авария", "Смоленская площадь"));
        as.add(2, new Accident(2, "Разлив топлива", "Разлилось топливо", "Норильск"));
        for (Map.Entry<Integer, Accident> a : as.getAccidents().entrySet()) {
            System.out.println(a.getKey() + " " + a.getValue());
        }
    }
}
