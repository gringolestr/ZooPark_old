package ZooPark;

import static ZooPark.AnimalType.HERBIVORE;

public class Elephant extends AnimalHerbivore {

    public String walk() {
        return isWalker;
    }

    public String getVoice() {
        return isVoicer;
    }


    private String isWalker = "Слон Шагает";
    private String isVoicer = "Слон Издает Рев";

    public String getIsWalker() {
        return isWalker;
    }

    public String getIsVoicer() {
        return isVoicer;
    }

    public Elephant(){
        name = "Слон";
        weight = 667;
        isMale = false;
        isPredator = HERBIVORE;
    }

}
