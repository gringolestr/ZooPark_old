package ZooPark;

//enum type {
//    ERBIVORE,PREDATOR
//}

public abstract class Animal implements Walker,Voicer {

//    public String walk() {
//
//        return name;
//
////        for (int i = 0; i < walkers.length; i++) {
////            System.out.println(walkers[i]);
////        }
//
//    }
//
//    public String getVoice() {
//
////        for (int i = 0; i < voicers.length; i++) {
////            System.out.println(voicers[i]);
////        }
//
//        return "Мяу";
//    }


    public String sleep () {
        //System.out.println("Спит (Хр-Хрррр)");
        return "Спит (Хр-Хрррр)";
    }


    private String name;
    private int weight;
    private boolean isMale;
    private boolean isPredator;
    private String isWalker;
    private String isVoicer;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean getIsMale() {
        return isMale;
    }

    public boolean getIsPredator() {
        return isPredator;
    }

    public String getIsWalker() {
        return isWalker;
    }

    public String getIsVoicer() {
        return isVoicer;
    }



    public Animal (String name, int weight, boolean isMale,boolean isPredator,String isWalker, String isVoicer) {
        this.name = name;
        this.weight = weight;
        this.isMale = isMale;
        this.isPredator = isPredator;
        this.isWalker = isWalker;
        this.isVoicer = isVoicer;
    }

}