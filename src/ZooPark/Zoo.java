package ZooPark;

import java.util.ArrayList;
import java.util.List;

public class Zoo  {

    Cage<Animal> predatorAnimals = new Cage();

    Cage<Animal> herbivoresAnimals = new Cage();

    Man mans = new Man();

    private List<Voicer> voicers = new ArrayList<Voicer>();
    private List<Walker> walkers = new ArrayList<Walker>();
    private List<Speaker> speakers = new ArrayList<Speaker>();
    private List<Observer> observers = new ArrayList<Observer>();


    public void addVoicers(Animal a) {
        this.voicers.add(a);
    }

    public void addWalkers(Animal a) {
        this.walkers.add(a);
    }


    public void addSpeakers(Person a) {
        this.speakers.add(a);
    }

    public void addWalkers(Person a) {
        this.walkers.add(a);
    }

    public void addObservers(Person a) {
        this.observers.add(a);
    }

    public void addObservers(Camera a) {
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
//        for (Walker a: walkers) {
//            System.out.println(walkers.toString());
//        }
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

        for (int i = 0; i < predatorAnimals.getResult().size(); i++) {
            System.out.println("Это клетка Хищников, тут находится "+predatorAnimals.getResult().get(i).getName() +", Весит "+predatorAnimals.getResult().get(i).getWeight()+" кг, Пол Муж "+predatorAnimals.getResult().get(i).getIsMale());
        }

        for (int i = 0; i < herbivoresAnimals.getResult().size(); i++) {
            System.out.println("Это клетка Травоядных, тут находится "+herbivoresAnimals.getResult().get(i).getName() +", Весит "+herbivoresAnimals.getResult().get(i).getWeight()+" кг, Пол Муж "+herbivoresAnimals.getResult().get(i).getIsMale());
        }
    }

    public void printALLperson () {

        for (int i = 0; i < mans.getResultM().size(); i++) {
            System.out.println("Гуляет в Зоопарке "+mans.getResultM().get(i).getName() + ", Он  "+mans.getResultM().get(i).getPosition() + ", Весит "+mans.getResultM().get(i).getWeight()+", кг Пол Муж "+mans.getResultM().get(i).getIsMale());
        }
    }

    public Cage getPredator() {
        return predatorAnimals;
    }

    public Cage getHerbivores() {
        return herbivoresAnimals;
    }


    public void addAnimal (Animal animal) {
        if (animal instanceof AnimalPredator) {
            predatorAnimals.putAnimal(animal);
        }

        if (animal instanceof AnimalHerbivore) {
            herbivoresAnimals.putAnimal(animal);
        }
    }

    public void addPerson (Person person) {
        mans.putPersonM(person);
    }

}
