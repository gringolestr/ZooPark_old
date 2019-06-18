package ZooPark;

import java.util.ArrayList;
import java.util.List;

class Zoo<obj> {

    Cage predatorAnimals = new Cage();

    Cage herbivoresAnimals = new Cage();

    Man mans = new Man();

    private List<Voicer> voicers = new ArrayList<Voicer>();
    private List<Walker> walkers = new ArrayList<Walker>();
    private List<Speaker> speakers = new ArrayList<Speaker>();
    private List<Observer> observers = new ArrayList<Observer>();

    ////// Сетеры

    public void setvoicers(Tigr a) {
        this.voicers.add(a);
    }

    public void setwalkers(Tigr a) {
        this.walkers.add(a);
    }

    public void setvoicers(Zebra a) {
        this.voicers.add(a);
    }

    public void setwalkers(Zebra a) {
        this.walkers.add(a);
    }

    //

    public void setspeakers(Visiter a) {
        this.speakers.add(a);
    }

    public void setwalkers(Visiter a) { this.walkers.add(a); }

    public void setobservers(Visiter a) {
        this.observers.add(a);
    }

    //////// Гетеры

    public List<Voicer> getVoicers() {
        return voicers;
    }

    public List<Walker> getWalkers() {
        return walkers;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public List<Observer> getObservers() {
        return observers;
    }


    ///////


    public void printALLWalkers () {

        for (int i = 0; i < walkers.size(); i++) {
            System.out.println(walkers.get(i).walk());
        }
    }

    public void printALLSpeakers () {

        for (int i = 0; i < speakers.size(); i++) {
            System.out.println(speakers.get(i).speak());
        }
    }

    public void printALLVoicers () {

        for (int i = 0; i < voicers.size(); i++) {
            System.out.println(voicers.get(i).getVoice());
        }
    }

    public void printALLObservers () {

        for (int i = 0; i < observers.size(); i++) {
            System.out.println(observers.get(i).observe());
        }
    }

    public void printALLAnimals () {

        for (int i = 0; i < predatorAnimals.getResultH().size(); i++) {
            System.out.println("В этой Клетке Животное "+predatorAnimals.getResultH().get(i).getName() +", Весит "+predatorAnimals.getResultH().get(i).getWeight()+" кг Пол Муж "+predatorAnimals.getResultH().get(i).getIsMale());
        }

        for (int i = 0; i < predatorAnimals.getResultP().size(); i++) {
            System.out.println("В этой Клетке Животное "+predatorAnimals.getResultP().get(i).getName() +", Весит "+predatorAnimals.getResultP().get(i).getWeight()+" кг, Пол Муж "+predatorAnimals.getResultP().get(i).getIsMale());
        }
    }


    public void printALLperson () {

        for (int i = 0; i < mans.getResultM().size(); i++) {
            System.out.println("В этом Зоопарке "+mans.getResultM().get(i).getName() +", Весит "+mans.getResultM().get(i).getWeight()+", кг Пол Муж "+mans.getResultM().get(i).getIsMale());
        }
    }


    public Cage getPredatorA() {
        return predatorAnimals;
    }

    public Cage getherbivoresA() {
        return herbivoresAnimals;
    }


    public void addAnimal (String name, int weight, boolean isMale, boolean isPredator, String isWalker, String isVoicer) {

        if (isPredator == true) {

            Tigr B = new Tigr(name, weight, isMale, isPredator, isWalker, isVoicer);
            predatorAnimals.putAnimalP(B);

        } else {

            Zebra B2 = new Zebra(name, weight, isMale, isPredator, isWalker, isVoicer);
            herbivoresAnimals.putAnimalH(B2);

        }

    }

    public void addPerson (String name, int weight, boolean isMale, boolean isPredator, String isWalker, String isSpeaker, String isObserver) {

            Visiter B3 = new Visiter(name, weight, isMale, isPredator, isWalker, isSpeaker, isObserver);
        mans.putPersonM(B3);
    }

}
