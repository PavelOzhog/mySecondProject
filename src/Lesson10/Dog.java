package Lesson10;

public class Dog extends Animal {   // только два слова extends. extends является ли


    public void printToConsole(){  // сигнатура метода ( шапка метода)
        System.out.println("dog with age" + this.getAge());
    }

    public void print() {
        System.out.println("7689" + this.getPhone());
    }

}
