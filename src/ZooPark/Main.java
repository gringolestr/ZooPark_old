package ZooPark;

public class Main {


    public static void main(String[] args) {

        Zoo zoo = new Zoo();

//        String[] observers = { "Смотреть", "Снимать", "Разглядывать", "Видеть" };

        zoo.addAnimal("Тигр",100,true,true,"Очень Быстро бегает", "Громко Рычит");


        zoo.addAnimal("Зебра",100,true,true,"Быстро Бегае","Мычит");

        zoo.addPerson("Вася", 70, true, false, "Пешком", "Поет песни","Наблюдает");

        zoo.addPerson("Миша", 60, true, false, "Пешком", "Поет песни","Наблюдает");

        zoo.addPerson("Петя", 65, true, false, "Бегает", "Говорит по телефону","Смотрит");


        zoo.setvoicers(new Tigr("Тигр",100,true,true,"Очень Быстро бегает", "Громко Рычит"));

        zoo.setwalkers(new Tigr("Тигр",100,true,true,"Очень Быстро бегает", "Громко Рычит"));

        zoo.setvoicers(new Zebra("Зебра",100,true,false,"Быстро Бегает","Мычит"));

        zoo.setwalkers(new Zebra("Зебра",100,true,false,"Быстро Бегает","Мычит"));


        zoo.setwalkers(new Visiter("Вася", 70, true, false, "Пешком", "Поет песни","Наблюдает"));

        zoo.setspeakers(new Visiter("Вася", 70, true, false, "Пешком", "Поет песни","Наблюдает"));

        zoo.setobservers(new Visiter("Вася", 70, true, false, "Пешком", "Поет песни","Наблюдает"));

        /////////


        zoo.printALLAnimals();



        zoo.printALLWalkers();

        zoo.printALLVoicers();



        zoo.printALLObservers();

        zoo.printALLSpeakers();

        zoo.printALLperson();

    }

}
