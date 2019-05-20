package Lesson10.Practika;

public class Pramoug  extends Figura   {
    private int a;
    private int b;

    public Pramoug(){

    }

    public Pramoug(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public Pramoug setA(int a) {
        this.a = a;
        return this;
    }

    public int getB() {
        return b;
    }

    public Pramoug setB(int b) {
        this.b = b;
        return this;
    }


    @Override
    public void printPloshad() {
        System.out.println("площадь прямоугольника " + (a * b));
    }

    @Override
    public void printPerimetr() {
        System.out.println("периметр прямоугольника " + (a + b)* 2);

    }

    @Override
    public void printDlinaRound() {

    }
}
