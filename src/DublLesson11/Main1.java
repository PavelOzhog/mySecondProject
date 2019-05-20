package DublLesson11;

public class Main1 {

    public static void main(String[] args) {
        // ZooAnimal animal = new ZooAnimal();
        // нельзя создавать объект абстрактного класса


        Zoo zoo = new Zoo(100000);

        Tiger tiger = new Tiger(20000, 150.5);
        Monkey monkey = new Monkey(30000, 45.7 );
        Monkey monkey1 = new Monkey(23000, 47.4);
        Parrot parrot = new Parrot(17000, 1.5);
        Parrot parrot1 = new Parrot(33000, 0.5);




        zoo.buyAnimal(tiger);
        zoo.buyAnimal(monkey);
        zoo.buyAnimal(monkey1);
        zoo.buyAnimal(parrot);
        zoo.buyAnimal(parrot1);

        zoo.printAnimal();
        zoo.voice();
        zoo.dorAnimal();
        zoo.summaa();
        zoo.weight();
        zoo.cheapAnimal();
        zoo.heavyAnimal();
        zoo.ostMoney();
    }
}
