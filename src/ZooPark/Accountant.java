package ZooPark;

public class Accountant extends Person{

    public String walk() {
        return "Прогуливается";
    }

    public String speak() {
        return "Разговаривает c подругой";
    }

    public String observe() {
        return "Наблюдает за животными";
    }

    public Accountant(String name, int weight, boolean isMale, boolean isPredator, String isWalker, String isSpeaker, String isObserver) {
        super(name, weight, isMale, isPredator, isWalker, isSpeaker, isObserver);
    }



    public static void getBalance (Animal[] animals) {

        Zoo zoo = new Zoo();

        for (int i = 0; i < zoo.getPredatorA().getResultP().size(); i++) {
            System.out.println(zoo.getPredatorA().getResultP().get(i).getName());
            //System.out.println(predatorA.getResultP().size());
        }

        for (int i = 0; i < zoo.getherbivoresA().getResultH().size(); i++) {
            System.out.println(zoo.getherbivoresA().getResultH().get(i).getName());
        }

    }

}
