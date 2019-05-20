package Lesson9.Lesson9Homework;

public class Treug {
    private double osnovanie;
    private double height;
    private double storona_A;
    private double storona_B;
    private String name;

    public Treug(String newName, double newHeight, double newOsnovanie) {
        name = newName;
        height = newHeight;
        osnovanie = newOsnovanie;
    }

    public Treug() {
    }

    public void setOsnovanie(double newOsnovanie1) {
        osnovanie = newOsnovanie1;
    }

    public double getOsnovanie() {
        return osnovanie;
    }

    public void setHeight(double newHeight1) {
        height = newHeight1;
    }

    public double getHeight() {
        return height;
    }

    public void setStorona_A(double newStoronaA) {
        storona_A = newStoronaA;
    }

    public double getStorona_A() {
        return storona_A;
    }

    public void setStorona_B(double newStoronaB) {
        storona_B = newStoronaB;
    }

    public double getStorona_B() {
        return storona_B;
    }

    public double getPloshad() {
        double ploshad = (osnovanie * height) / 2;
        return ploshad;
    }

    public double getPerimeter() {
        double perimeter = osnovanie + storona_A + storona_B;
        return perimeter;
    }


}

