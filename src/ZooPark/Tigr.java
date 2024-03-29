package ZooPark;

import sun.font.TrueTypeFont;

import static ZooPark.AnimalType.PREDATOR;

public class Tigr extends AnimalPredator {

    public String walk() {
        return isWalker;
    }

    public String getVoice() {
        return isVoicer;
    }


    private String isWalker = "Тигр Быстро Бегает";
    private String isVoicer = "Тигр Рычит";


    public String getIsWalker() {
        return isWalker;
    }

    public String getIsVoicer() {
        return isVoicer;
    }

    public Tigr (){
    name = "Тигр";
    weight = 150;
    isMale = true;
    isPredator = PREDATOR;
    }
}
