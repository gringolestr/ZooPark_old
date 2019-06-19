package ZooPark;

import static ZooPark.AnimalType.PREDATOR;

public class Lion extends AnimalPredator {

    public String walk() {
        return isWalker;
    }

    public String getVoice() {
        return isVoicer;
    }


    private String isWalker = "Быстро Бегает";
    private String isVoicer = "Рычит";


    public String getIsWalker() {
        return isWalker;
    }

    public String getIsVoicer() {
        return isVoicer;
    }

    public Lion(){
    name = "Лев";
    weight = 180;
    isMale = true;
    isPredator = PREDATOR;
    }
}
