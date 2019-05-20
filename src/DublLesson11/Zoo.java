package DublLesson11;

public class Zoo {

    private int money;

    private ZooAnimal[] animals = new ZooAnimal[10];

    public Zoo() {
    }

    public Zoo(int money) {

        this.money = money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }


    public void buyAnimal(ZooAnimal animal) {

        if (money < animal.getCost()) {
            System.out.println("не хватает денег");
            return;
        }


        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                money = money - animal.getCost();
                animals[i] = animal;
                return;
            }
        }
        System.out.println("нет свободн клеток");
    }

    public void printAnimal() {
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


    public void dorAnimal() {
        ZooAnimal maxCost = animals[0];

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {

                if (animals[i].getCost() > maxCost.getCost()) {
                    maxCost = animals[i];
                }
            }
        }
        System.out.println("самое дорогое животное");
        maxCost.printInfo();
    }


    public void summaa() {
        int summa = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                summa += animals[i].getCost();
            }
        }

        System.out.println(summa);
    }


    public void weight() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                animals[i].printInfo();
            }
        }
    }

    public void cheapAnimal() {

        ZooAnimal minCost = animals[0];

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {

                if (animals[i].getCost() < minCost.getCost()) {
                    minCost = animals[i];
                }
            }
        }
        System.out.println("самое дешевое животное");
        minCost.printInfo();
    }

    public void heavyAnimal() {

        ZooAnimal maxWeight = animals[0];

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {

                if (animals[i].getWeight() > maxWeight.getCost()) {
                    maxWeight = animals[i];
                }
            }
        }
        System.out.println("самое тяжелое животное");
        maxWeight.printInfo();
    }

    public void ostMoney (){
        System.out.println("у зоопарки осталось " + money);
    }


}
