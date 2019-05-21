package Lesson11_1;

public class Tiger extends ZooAnimal {
    public Tiger() {
        super();
    }




    public Tiger(int cost) {
        super(cost);
    }

    @Override
    public void voice() {
        System.out.println("vdsfesdf");
    }

    @Override
    public void jump() {
        System.out.println("тигр прыгает");
    }

    @Override
    public void printInfo() {
        System.out.println("тигр со стоимостью" + this.getCost());
    }
}
