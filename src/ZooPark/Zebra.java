package ZooPark;

import static ZooPark.AnimalType.HERBIVORE;

public class Zebra extends AnimalHerbivore {

    public String walk() {
        return isWalker;
    }

    public String getVoice() {
        return isVoicer;
    }


    private String isWalker = "Зебра Бегает";
    private String isVoicer = "Зебра Мычит";

    public String getIsWalker() {
        return isWalker;
    }

    public String getIsVoicer() {
        return isVoicer;
    }

    public Zebra (){
        name = "Зебра";
        weight = 67;
        isMale = false;
        isPredator = HERBIVORE;
    }

}
