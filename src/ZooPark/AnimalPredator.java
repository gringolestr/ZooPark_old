package ZooPark;

public abstract class AnimalPredator extends Animal {




    public String eat() {
        //System.out.println("Питается мясом");
        return "Питается мясом";
    }



    public AnimalPredator(String name, int weight, boolean isMale,boolean isPredator, String isWalker, String isVoicer) {

       super(name, weight, isMale, isPredator, isWalker, isVoicer);
    }

}
