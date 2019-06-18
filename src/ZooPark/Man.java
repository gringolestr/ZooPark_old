package ZooPark;

import java.util.ArrayList;
import java.util.List;

public class Man {

    private List<Person> resultM = new ArrayList<Person>();

    ////// Гетер

    public void putPersonM(Person a) {
        this.resultM.add(a);
    }

    /////// Сетеры

    public List<Person> getResultM() {
        return resultM;
    }

}
