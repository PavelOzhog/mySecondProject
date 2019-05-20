package DublLesson11;

public abstract class ZooAnimal {

    private int cost;

    private double weight;


    public ZooAnimal() {
    }

    public ZooAnimal(int cost) {
        this.cost = cost;
    }

    public ZooAnimal(double weight) {
        this.weight = weight;
    }

  public ZooAnimal (int cost, double weight) {
        this.cost= cost;
        this.weight = weight;
  }


    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }


    public abstract void printInfo();

    public abstract void voice();

    public abstract void jump();


}
