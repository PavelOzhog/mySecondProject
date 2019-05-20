package Lesson10.Practika;

public class Treug extends Figura {

    private int a;
    private int b;
    private int c;


    public Treug() {
    }


    public Treug(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public int getA() {
        return a;
    }

    public Treug setA(int a) {
        this.a = a;
        return this;
    }

    public int getB() {
        return b;
    }

    public Treug setB(int b) {
        this.b = b;
        return this;
    }

    public int getC() {
        return c;
    }

    public Treug setC(int c) {
        this.c = c;
        return this;
    }

    @Override
    public void printPloshad() {
        //super.printPloshad();
        System.out.println(" площадь треугольника " + (a * b));

    }

    @Override
    public void printPerimetr() {
        // super.printPerimetr();
        System.out.println("периметр треугольника " + (a + b + c));
    }

    @Override
    public void printDlinaRound() {

    }
}

