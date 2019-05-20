package Lesson11;

public class Main1 {
    public static void main(String[] args) {

        Zoo zoo = new Zoo(100000);

        Tiger tiger = new Tiger(20000);

        Parrot parrot1 = new Parrot(40000);
        Parrot parrot2 = new Parrot(10000);


        Monkey monkey1 = new Monkey(20000);
        Monkey monkey2 = new Monkey(12000);

        zoo.buyAnimal(tiger);
        zoo.buyAnimal(parrot1);
        zoo.buyAnimal(parrot2);
        zoo.buyAnimal(monkey1);
        zoo.buyAnimal(monkey2);

        zoo.printAnmal();

        zoo.voice();
        zoo.biggestPrice();
        zoo.getSumma();
    }
}
