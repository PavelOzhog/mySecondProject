package Lesson10;

public class Cat extends Animal {

    public void printToConsole(){   // переопределение метода это когда в дочернем классе мы объявляем метод ровно с такой же сигнатурой как метод в родительском классе, но при этом изменяем тело метода
        System.out.println("cat with age" + this.getAge());
    }
    public void print() {
        System.out.println("1234" + this.getPhone());
    }

}
