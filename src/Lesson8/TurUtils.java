package Lesson8;

public class TurUtils {
    public static void printToursByCountry(String[][] tours, String country) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0].equals(country)) {
                System.out.println(tours[i][0] + tours[i][1] + tours[i][2] + tours[i][3]);
            }
        }
    }

    public static void printExpensive(String[][] tours) {
        int maxPrice = 0;


        for (int i = 0; i < tours.length; i++) {
            int priceNum = Integer.parseInt(tours[i][1]);


                if (priceNum > maxPrice) {
                    maxPrice = priceNum;
                }

            }
            System.out.println(maxPrice);
        }

    public static void printAveragePrice ( String [][] tours ){
        int allCostPrice = 0;
        for (int i = 0; i < tours.length; i++){
            int priceNum = Integer.parseInt(tours[i][1]);
            allCostPrice += priceNum;

        }
        System.out.println(allCostPrice/ tours.length);
    }


}

