package Lesson10;

public class Main1 {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setAge(12);

    Dog dog = new Dog();
    dog.setAge(10);
        System.out.println(dog.getAge());


   Cat cat = new Cat();
   cat.setAge(6);

   Animal [] animals = new Animal[2];
   animals[0] = cat;
   animals[1] = dog;

   for (int i = 0; i < animals.length; i++){
       animals[i].printToConsole();
   }






    }
}