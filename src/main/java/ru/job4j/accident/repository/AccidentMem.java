package ru.job4j.accident.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.accident.model.Accident;
import java.util.HashMap;
@Repository
public class AccidentMem {

    private HashMap<Integer, Accident> accidents = new HashMap();

    public AccidentMem() {
        accidents.put(1, new Accident(1, "ДТП", "Произошла авария", "Смоленская площадь"));
        accidents.put(2, new Accident(2, "Разлив топлива", "Разлилось топливо", "Норильск"));
    }

    public HashMap<Integer, Accident> getAccidents() {
        return accidents;
    }

    public void setAccidents(HashMap<Integer, Accident> accidents) {
        this.accidents = accidents;
    }

    public Accident add(Integer id, Accident accident) {
        return accidents.put(id, accident);
    }

}
