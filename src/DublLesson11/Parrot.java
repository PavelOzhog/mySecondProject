package DublLesson11;

public class Parrot extends ZooAnimal {


   public Parrot (){
       super ();
   }

   public Parrot (int cost) {
       super (cost);
   }

    public Parrot (double wieght) {super (wieght);}

    public Parrot (int cost, double weight) {
        super(cost, weight);
    }


    @Override
    public void printInfo() {
        System.out.println(" попугай со стоимостью " + this.getCost() + " и весом " + this.getWeight());
    }


    @Override
    public void voice() {
        System.out.println(" jjfjff");
    }

    @Override
    public void jump() {
        System.out.println("попугай прыгает");
    }
}
