package HomeLesson6;

public class Main1 {
    public static void main(String[] args) {
// метод который считае периметр треугольника
        double ploshad = Calculations.triangleArea(4.0, 6.0, 8.0);
        System.out.println(ploshad);

        //  метод четных чисел
        int[] massiv = {5, 3, 42, 55, 3, 23, 53, 66};
        int chislo = Calculations.chetnoe(massiv);

// сумма дробей
        Calculations.summaDrobei(5, 3, 7, 8);

        //реверс текста
        StringUtils.reverse("Buying a Piece of Bob Marley’s Song Catalog, and His Enduring Legacy!");

// подсчёт гласных
        StringUtils.countGlass("When Chris Blackwell, the founder of Island Records");

// подсчёт согласных
        StringUtils.countSoglasnie("When Chris Blackwell, the founder of Island Records");
    }

}