package ZooPark;

import java.util.ArrayList;
import java.util.List;

public class Cage <T> {

    private List<T> result = new ArrayList<T>();

    //private List<? extends AnimalPredator>> result = new ArrayList<>();


    public void putAnimal(T a) {
        this.result.add(a);
    }

    public List<T> getResult() {
        return result;
    }

}
