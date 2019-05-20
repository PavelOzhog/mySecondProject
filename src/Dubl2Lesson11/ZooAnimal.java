package Dubl2Lesson11;

public abstract class  ZooAnimal {

   private int cost;
   public ZooAnimal (){}
   public ZooAnimal (int cost){
       this.cost = cost;
   }

public void srtCost (int cost) {
       this.cost = cost;
}
public int getCost (){
       return cost;
}

    public abstract void voice();

    public abstract void jump ();

}
