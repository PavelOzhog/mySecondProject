package Lesson11_1;



public class Parrot extends ZooAnimal {


    public Parrot() {
   super();
    }

    public Parrot(int cost) {
        super(cost);
    }

    @Override
    public void voice() {
        System.out.println("YSYSDYDydyyas");
    }

    @Override
    public void jump() {
        System.out.println("попугай прыгает");
    }

    public void printInfo() {
        System.out.println("попугай со стоимостью" + this.getCost());
    }
}
