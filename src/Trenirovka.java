public class Trenirovka {
    public static void main(String[] args) {
        String[][] trips = {{"Греция", " 16 дней", "10000 долларов"},
                {"Франция", " 6 дней", "5000 долларов"},
                {"Германия", " 78 дней", "3200 долларов"},
                {"Тунис", " 34 дней", "2300 долларов"}};


//        for (int i = 0; i < trips.length; i++) {
//
//        for (int j = 0; j < trips.length; j++) {
//            char[] massiv = trips[i][j].toCharArray();
//
//            if (massiv[j] == '8') {
//                System.out.println(trips[i][j]);
//            }
//        }
//    }
for (int i = 0; i < trips.length; i++){
    if(trips[i][0].equals("Германия")){
        System.out.println(trips[i][0] + trips[i][1]  + trips[i][2]);
    }
}

    }
}
