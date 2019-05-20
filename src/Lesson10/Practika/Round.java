package Lesson10.Practika;

public class Round extends Figura {
    private int rad;

    public Round() {
    }

    public Round(int rad) {
        this.rad = rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public int getRad() {
        return rad;
    }


    @Override
    public void printPloshad() {
        System.out.println("площадь круга " + ((rad * rad) * 3.14));
    }

    @Override
    public void printPerimetr() {

    }

    @Override
    public void printDlinaRound() {
        System.out.println("длина круга " + ((rad * 2) * 3.14));
    }


}