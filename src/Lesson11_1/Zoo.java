package Lesson11_1;

public class Zoo {

    private int money;
    private ZooAnimal[] animals = new ZooAnimal[10];


    public Zoo() {

    }

    public Zoo(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    public void buyAnimal(ZooAnimal animal) {
        if (money < animal.getCost()) {
            System.out.println("недостаточное количество денег ");
            return;
        }


        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                money = money - animal.getCost();
                animals[i] = animal;
                return;
            }

        }
        System.out.println("нет свободных клеток");

    }

    public void printAnmal() {

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                animals[i].printInfo();
            }
        }

    }

    public void voice() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                animals[i].voice();
            }
        }
    }

    // полиморфизм - это свойство джавы которое проявляется в момент выполнения программы,
// Джава думает что работает с одинаковым типом данных, а на самом деле с разными.
    //
    public void biggestPrice() {

        ZooAnimal maxCostAnimal = animals[0];

        for (int i = 0; i < animals.length; i++) {

            if (animals[i] != null) {
                if (maxCostAnimal.getCost() < animals[i].getCost()) {
                    maxCostAnimal = animals[i];
                }
            }
        }
        System.out.println("самое дорогое животное");
        maxCostAnimal.printInfo();

    }

    public void getSumma() {
        int summa = 0;

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {

                summa = summa + animals[i].getCost();
            }

        }
        System.out.println(summa);

    }
}




