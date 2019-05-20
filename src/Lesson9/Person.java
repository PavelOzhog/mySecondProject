package Lesson9;

public class Person {
    private  int age;
    private String name;
    private String sername;
    private long phoneNumber;

   public Person (int newAge, String newName, long newPhone){
       age = newAge;
       name = newName;
       phoneNumber = newPhone;
                     }


    public Person (long newPhoneNumb, String newSername ){

        sername = newSername;
        phoneNumber = newPhoneNumb;
    }

    public Person (int newAge4, String newSername1){
        age = newAge4;
        sername = newSername1;

    }







   //Person man1 = new Person(int newAge, String Name, long newPhone);



}
