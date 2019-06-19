package ZooPark;

public abstract class Animal implements Walker,Voicer {

    protected String name;
    protected int weight;
    protected boolean isMale;
    protected AnimalType isPredator;

    public String sleep () {
        return "Спит (Хр-Хрррр)";
    }
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean getIsMale() {
        return isMale;
    }

    public AnimalType getIsPredator() {
        return isPredator;
    }
  }