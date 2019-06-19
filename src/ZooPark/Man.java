package ZooPark;

import java.util.ArrayList;
import java.util.List;

public class Man {

    private List<Person> resultM = new ArrayList<Person>();


    public void putPersonM(Person a) {
        this.resultM.add(a);
    }


    public List<Person> getResultM() {
        return resultM;
    }

}
