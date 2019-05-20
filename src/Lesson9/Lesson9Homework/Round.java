package Lesson9.Lesson9Homework;

public class Round {
    private String name;
    private double diametr;
    private double radius;
    private double dlinaDugi;
    private double Pi = 3.14;

    public Round(String newName, double newDiameter, double newRadius, double newDlinaDugi) {
        name = newName;
        diametr = newDiameter;
        radius = newRadius;
        dlinaDugi = newDlinaDugi;
    }

    public Round() {
    }

    public void setName(String newName1) {
        name = newName1;
    }

    public String getName() {
        return name;
    }

    public void setDiametr(double newDiametr1) {
        diametr = newDiametr1;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setRadius(double newRadius1) {
        radius = newRadius1;
    }
 public double getRadius (){
        return radius;
 }

public void setDlinaDugi(double newDlinaDugi1){
        dlinaDugi = newDlinaDugi1;
}
public double getDlinaDugi (){
        return dlinaDugi;
}

public double getPloshad(){
        double ploshad = Pi * (radius * radius);
                return ploshad;
}


}