package Lesson11_1;

public abstract class ZooAnimal {

    private int cost;


    public ZooAnimal() {
    }

    public ZooAnimal(int cost) {
        this.cost = cost;
    }

    public void setCost(int cost) {
        this.cost = cost;

    }

    public int getCost() {
        return cost;
    }


    public abstract void voice();

    public abstract void jump();

    public abstract void printInfo();
}
