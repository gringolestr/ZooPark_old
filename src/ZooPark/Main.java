package ZooPark;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        Zebra zebra = new Zebra();

        zoo.addAnimal(zebra);

        Elephant elephant = new Elephant();

        zoo.addAnimal(elephant);


        Tigr tigr = new Tigr();

        zoo.addAnimal(tigr);

        Lion lion = new Lion();

        zoo.addAnimal(lion);


        Visiter visiter = new Visiter();

        zoo.addPerson(visiter);

        ZooKeeper zookeeper = new ZooKeeper();

        zoo.addPerson(zookeeper);

        Accountant accountant = new Accountant();

        zoo.addPerson(accountant);

        Camera camera = new Camera();



        zoo.addVoicers(tigr);

        zoo.addWalkers(tigr);

        zoo.addVoicers(zebra);

        zoo.addWalkers(zebra);


        zoo.addWalkers(visiter);

        zoo.addSpeakers(visiter);

        zoo.addObservers(visiter);

        zoo.addObservers(camera);

        /////////

        zoo.printALLAnimals();


        zoo.printALLWalkers();

        zoo.printALLVoicers();

        zoo.printALLObservers();

        zoo.printALLSpeakers();


        zoo.printALLperson();


        accountant.getBalance(zoo.getPredator().getResult()); // Клетка Одын

        accountant.getBalance(zoo.getHerbivores().getResult()); // Ешо Одна


    }
}
