package Trenirovka90;

public class Person {
    private int age;
    private String name;
    private String sirname;
    private long phone;

   public Person (){

   }

    public Person(int newA) {
        age = newA;
    }

    public Person(String newNAme) {
        name = newNAme;
    }

    public Person(long newPhone) {
        phone = newPhone;
    }

    public Person(int newAge, String newName) {
        age = newAge;
        name = newName;
    }

    public Person(int newA2, long newPhone) {
        age = newA2;
        phone = newPhone;
    }

    public Person(String newName, int newA3) {
        name = newName;
        age = newA3;
   }

   public String getName (){
       return name;
   }
}
