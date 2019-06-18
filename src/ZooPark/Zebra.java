package ZooPark;

public class Zebra extends AnimalHerbivore {

    public String walk() {
        return "";
    }

    public String getVoice() {
        return "";
    }

    public Zebra(String name, int weight, boolean isMale, boolean isPredator,String isWalker, String isVoicer) {
        super(name, weight, isMale, isPredator,isWalker,isVoicer);
    }
}
