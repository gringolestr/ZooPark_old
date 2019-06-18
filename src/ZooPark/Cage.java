package ZooPark;

import java.util.ArrayList;
import java.util.List;

public class Cage {

    private List<Animal> resultP = new ArrayList<Animal>();

    private List<Animal> resultH = new ArrayList<Animal>();


    public void putAnimalP(Animal a) {
        this.resultP.add(a);
    }

    public void putAnimalH(Animal a) {
        this.resultH.add(a);
    }

    /////// Сетеры

    public List<Animal> getResultP() {
        return resultP;
    }

    public List<Animal> getResultH() {
        return resultH;
    }

}
