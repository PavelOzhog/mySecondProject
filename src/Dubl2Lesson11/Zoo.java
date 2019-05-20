package Dubl2Lesson11;

public class Zoo {
    private int money;

   private ZooAnimal [] animals = new ZooAnimal[10];

   public Zoo (){}

   public Zoo (int money){
       this.money = money;
   }

    public void buyAnimal (ZooAnimal animal){


           if (money < animal.getCost()){
               System.out.println("не хватает денег для покупки");
               return;
       }


for (int i = 0; i < animals.length; i ++){

    if (animals[i] == null){
        money = money - animal.getCost();
        animals[i] = animal;
        return;
    }
}
        System.out.println("нет свободных клеток");
    }


}
