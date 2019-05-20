package Trenirovka90;

public class Main2 {
    public static void main(String[] args) {
        Cat firstCat = new Cat();
       // Cat secondCat = new Cat();
        Cat thirdCat = new Cat();

Person Krasovsky = new Person("Petr", 23);
        System.out.println(Krasovsky.getName());



        firstCat.setAge(13);
firstCat.setPoroda("short Cat");
firstCat.setDlina(3.4);

Cat secondCat = new Cat(13 , " poroda", 4.3);
secondCat.setDlina(4.6);

//secondCat.setAge(11);
//secondCat.setPoroda("long Cat");
//secondCat.setDlina(5.2);


thirdCat.setAge(7);
thirdCat.setPoroda("fat Cat");
thirdCat.setDlina(2.3);








    }
}
