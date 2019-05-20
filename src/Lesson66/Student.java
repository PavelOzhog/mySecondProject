package Lesson66;

public class Student {
    //формула создания метода
    // 1 - модификатор доступа(private, protected, public, пустое место)
    // public доступ по всему проекту
    // private - доступ только внутри текущего класса
    // protected - доступ только внутри текущего класса и его наследников
    // ' ' пустое место - доступ внутри текущей папки

    // 2 - указывается статичность static ( либо это слово есть, либо его нет)
    // 3 - указывается возвращаемы тип (int, string, char[].....)  или если нет возвращаемого типа - то void
    // 4 - название метода (придумываем в произвольной сами, ТОЛКО С МАЛЕНЬКОЙ БУКВЫ)
    // 5 - () задаём входящие параметры в круглых скобках через запятую, тип и название переменной
    // 6 - {} в фигурных скобочках идёт тело метода (что будет происходить, если это тело вызвать)


    public static int summaOfThreeNums(int a, int b, int c) {
        int summ = a + b + c;
        return summ;
    }

    public static int perimetr(int a, int b) {
        int perimetr = 2 * (a + b);
        return perimetr;
    }

    public static void privet(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("privet");
        }
    }

    public static void chetoeNechetnor(int a) {
        if (a % 2 == 0) {
            System.out.println("chetmoe");
        } else {
            System.out.println("nechetnoe");
        }


    }

    public static void chisla (int r){

    }

}


