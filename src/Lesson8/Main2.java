package Lesson8;

public class Main2 {
    public static void main(String[] args) {
        String[][] turs = {{"Greece", "15 000", "Hotel", "11 Days"},
                {"Italy", "25 000", "hostel", " 12 Days"},
                {"Spain", "44 000", "Hotel", " 17 Days"},
                {"Greece", "66 000", "Polypasionate", " 11 Days"}};


        TurUtils.printToursByCountry(turs, "Greece");
        TurUtils.printExpensive(turs);
        TurUtils.printAveragePrice(turs);

    }
}
