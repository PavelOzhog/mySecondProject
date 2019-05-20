package Dubl2Lesson11;

public class Tiger extends ZooAnimal {

public Tiger (){
    super ();
}
public Tiger (int cost){
    super (cost);
}


    @Override
    public void voice() {
        System.out.println("тигр рычит");
    }


    @Override
    public void jump() {
        System.out.println("тигр прыгает");
    }
}
