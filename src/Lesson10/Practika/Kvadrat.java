package Lesson10.Practika;

public class Kvadrat extends Figura {
    private int a;


    public Kvadrat(){}

    public Kvadrat(int a){
        this.a = a;
    }

    public void setA(int a){
        this.a = a;
    }

    public int getA (){
        return a;
            }

    @Override
    public void printPloshad() {
        System.out.println("площадь квадрата " + (a * a));
            }


    @Override
    public void printPerimetr() {
        System.out.println("периметр квадрата " + (a * 4));
    }

    @Override
    public void printDlinaRound() {

    }
}
