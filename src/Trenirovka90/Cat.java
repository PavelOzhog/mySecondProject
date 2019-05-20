
package Trenirovka90;

import java.lang.String;

public class Cat {
    private int age;
    private String poroda;
    private double dlinaHvosta;



   public Cat (){

   }



    public Cat (int newAge1, String newPoroda1, double newDh1){
    age = newAge1;
    poroda = newPoroda1;
    dlinaHvosta = newDh1;



    }





    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAgr() {
        return age;
    }

    public void setPoroda(String newPoroda) {
        poroda = newPoroda;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setDlina(double dh) {
        dlinaHvosta = dh;
    }

    public double getDlina() {
        return dlinaHvosta;
    }

}
