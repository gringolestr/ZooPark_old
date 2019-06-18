package ZooPark;

public  class Visiter extends Person{

    public String walk() {
        return "Прогуливается медленным шагом";
    }

    public String speak() {
        return "Разговаривает по телефону";
    }

    public String observe() {
        return "Наблюдает за животными";
    }


    public Visiter(String name, int weight, boolean isMale, boolean isPredator, String isWalker, String isSpeaker, String isObserver) {
        super(name, weight, isMale, isPredator, isWalker, isSpeaker, isObserver);
    }
}
