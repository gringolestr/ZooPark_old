package ZooPark;

public abstract class AnimalHerbivore extends Animal {

    public String eat() {
        //System.out.println("Питается растительной пищей");
        return "Питается растительной пищей";
    }

    public AnimalHerbivore(String name, int weight, boolean isMale,boolean isPredator, String isWalker, String isVoicer) {

        super(name, weight, isMale, isPredator, isWalker, isVoicer);
    }

}
