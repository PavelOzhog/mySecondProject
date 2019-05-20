package Lesson10;

public class Animal {

    private int age;
    private String name;
    private long phone;

    public Animal() {

    }

    public Animal(int age) {
        this.age = age;
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;


    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }


    public void printToConsole() {
        System.out.println("animal with age" + this.getAge());
    }


    public void setPhone(long phone){
        this.phone = phone;
    }

    public long getPhone(){
        return phone;
    }

    public void print() {
        System.out.println("kkjhkjh" + phone);
    }


}


