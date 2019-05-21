package Lesson11_1;

public class Monkey extends ZooAnimal {


    public Monkey() {
   super();
    }

    public Monkey(int cost) {
        super(cost);
    }

    @Override
    public void voice() {
        System.out.println("YAYAYAYYYAyyauhd");
    }

    @Override
    public void jump() {
        System.out.println("обезьяна прыгает");
    }

    @Override
    public void printInfo() {
        System.out.println("обезьяна со стоимостью " + this.getCost());
    }
}
