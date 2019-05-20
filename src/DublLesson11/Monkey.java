package DublLesson11;

public class Monkey extends ZooAnimal {

    public Monkey() {
        super();
    }

    public Monkey(int cost) {
        super(cost);
    }

    public Monkey(double wieght) {
        super(wieght);
    }

    public Monkey (int cost, double weight){
        super (cost, weight);
    }

    public void printInfo() {
        System.out.println(" обезьяна  со стоимостью " + this.getCost() + " и весом " + this.getWeight());
    }


    @Override
    public void voice() {
        System.out.println("ghjhljgllfilf");
    }

    @Override
    public void jump() {
        System.out.println("обезьяна прыгает");
    }


}



