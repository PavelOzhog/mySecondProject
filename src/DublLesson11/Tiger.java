package DublLesson11;

public class Tiger extends ZooAnimal {

    public Tiger() {
        super();
    }


    public Tiger(int cost) {
        super(cost);
    }




    public Tiger(double wieght) {
        super(wieght);
    }


    public Tiger (int cost, double weight) {
        super(cost,weight);

    }

    @Override
    public void printInfo() {
        System.out.println(" тигр со стоимостью " + this.getCost() + " и весом " + this.getWeight());
    }


    @Override
    public void voice() {
        System.out.println("kkirr4");
    }


    @Override
    public void jump() {
        System.out.println("fref");
    }
}
