package ZooPark;

import static ZooPark.AnimalType.PREDATOR;

public  class Visiter extends Person{

    public String walk() {
        return isWalker;
    }

    public String speak() {
        return isSpeaker;
    }

    public String observe() {
        return Observer;
    }

    private String isWalker = "Посетитель Прогуливается медленным шагом";
    private String isSpeaker = "Посетитель Разговаривает по телефону";
    private String Observer = "Посетитель Наблюдает за животными";

    public String getIsWalker() {
        return isWalker;
    }

    public String getIsSpeaker() {
        return isSpeaker;
    }

    public String getObserver() {
        return Observer;
    }

    public Visiter (){
        name = "Василий";
        position = "Посетитель";
        weight = 80;
        isMale = true;
        isPredator = PREDATOR;
    }

}
