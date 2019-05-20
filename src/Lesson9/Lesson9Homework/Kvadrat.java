package Lesson9.Lesson9Homework;

public class Kvadrat {
    private double width;
    private double height;     //нужно ли вообще прописывать, ведь все стороны равны

    public Kvadrat() {
    }

    public Kvadrat(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    public void setStoroni(double newWidth1, double newHeight2) {
        width = newWidth1;
        height = newHeight2;
    }

    public void setWidth(double newWidht2) {
        width = newWidht2;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double newHeight2) {
        height = newHeight2;
    }

    public double getHeight() {
        return height;
    }

    public double getPloshad() {
        double ploshad = width * height;
        return ploshad;
    }

    public double getPerimetr() {
        double perimetr = (width + height) * 2;
        return perimetr;
    }
}
