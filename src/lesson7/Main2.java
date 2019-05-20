package lesson7;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Начали отсчет");
        for (int years = 0; years < 5000; years ++ ){
            for(int days = 0; days < 365; days++){
                for (int hours = 0; hours < 24; hours++)
                    for (int min = 0; min < 60; min++)
                        for (int sec = 0; sec < 60; sec++) {
                            System.out.printf("от старта прошло %d года, %d дня, %d часа, %d минуты, %d секунд", years, days, hours, min, sec);
                            System.out.println();
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {

                            }

                        }
            }


        }
    }



}
