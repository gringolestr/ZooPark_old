package ZooPark;

public abstract class Person implements Walker,Observer,Speaker{

    protected String name;
    protected String position;
    protected int weight;
    protected boolean isMale;
    protected AnimalType isPredator;

    public String sleep () {
        return "Спит (Хр-Хрррр)";
    }
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
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
