package ZooPark;

import static ZooPark.AnimalType.PREDATOR;

public class ZooKeeper extends Person {

    public String walk() {
        return "Прогуливается медленным шагом";
    }

    public String speak() {
        return "Разговаривает по телефону";
    }

    public String observe() {
        return "Наблюдает за животными";
    }


    private String isWalker;
    private String isSpeaker;
    private String Observer;


    public String getIsWalker() {
        return isWalker;
    }

    public String getIsSpeaker() {
        return isSpeaker;
    }

    public String getObserver() {
        return Observer;
    }

    public ZooKeeper (){
        name = "Петр";
        position = "Дворник";
        weight = 70;
        isMale = true;
        isPredator = PREDATOR;
    }

}
