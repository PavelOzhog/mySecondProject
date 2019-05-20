package Lesson9.Lesson9Homework;

public class Main1 {
    public static void main(String[] args) {
        // Квадрат
        Kvadrat first = new Kvadrat(3.0, 4.3);

        first.setStoroni(3, 4);
        System.out.println(first.getPerimetr());
        System.out.println(first.getPloshad());
        first.setWidth(5);
        System.out.println("новая площадь равна " + first.getPloshad());
        System.out.println("новый периметр равен " + first.getPerimetr());
        first.setHeight(9);
        System.out.println(first.getHeight());

        // Треугольник
        Treug second = new Treug("треугольник", 15.1, 32.4);
        System.out.println(second.getPloshad());
        System.out.println(second.getOsnovanie());
        second.setStorona_A(5.2);
        second.setStorona_B(4.2);
        System.out.println(second.getStorona_A() + " и " + second.getStorona_B());
        System.out.println(second.getPerimeter());
        System.out.println(second.getPloshad());


    // Окружность
        Round third = new Round("окружность" ,3.4, 4.3, 6.4);
        System.out.println(third.getName()+ " " + third.getDiametr() + " " + third.getRadius() + " " + third.getDlinaDugi()  );

        System.out.println(third.getPloshad());
        third.setRadius(7.7);
        System.out.println(third.getRadius());
        third.setDiametr(1.1);
        System.out.println(third.getDiametr());
        third.setDlinaDugi(7.5);
        System.out.println(third.getDlinaDugi());

    }
}
