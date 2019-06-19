package ZooPark;

import java.util.List;

import static ZooPark.AnimalType.HERBIVORE;

import static ZooPark.AnimalType.PREDATOR;

public class Accountant extends Person{

    public String walk() { return isWalker; }

    public String speak() {
        return isSpeaker;
    }

    public String observe() {
        return Observer;
    }

    private String isWalker = "Прогуливается";
    private String isSpeaker = "Разговаривает c подругой";
    private String Observer= "Наблюдает за животными";

    public String getIsWalker() {
        return isWalker;
    }

    public String getIsSpeaker() {
        return isSpeaker;
    }

    public String getObserver() {
        return Observer;
    }


    public void getBalance (List<Animal> animals) {

        if (animals.get(0).isPredator == PREDATOR) {

            System.out.println("В зоопарке Хищных Животных = " + animals.size());
        }

        if (animals.get(0).isPredator == HERBIVORE) {

            System.out.println("В зоопарке Тровоядных Животных = " + animals.size());
        }
    }

    public Accountant (){
        name = "Елена";
        position = "Бухгалтер";
        weight = 66;
        isMale = false;
        isPredator = PREDATOR;
    }
}
