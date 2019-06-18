package ZooPark;

public class Tigr extends AnimalPredator {

    public String walk() {
        return "Быстро Бегает";
    }

    public String getVoice() {
        return "Рычит";
    }


    public Tigr(String name, int weight, boolean isMale, boolean isPredator,String isWalker, String isVoicer) {
        super(name, weight, isMale, isPredator, isWalker, isVoicer);
    }
}
