package Trenirovka90;

public class Main1 {
    public static void main(String[] args) {

        Phone meizu = new Phone();
        Phone xiaomi = new Phone();


//        meizu.price = 1000;
//        xiaomi.price = 8000;
//
//
//        System.out.println(xiaomi.price);

        meizu.setPrice(10000);
        xiaomi.setPrice(8000);

        System.out.println(meizu.getPrice());
        System.out.println(xiaomi.getPrice());

        meizu.setDiagonal(4.3);
        xiaomi.setDiagonal(5.5);

        double resultMeizu = meizu.getDiagonal();
        double resultXiaomi = xiaomi.getDiagonal();


        System.out.println(meizu.getDiagonal());
        System.out.println(xiaomi.getDiagonal());

        meizu.setModel("krutoi Telephone");
        xiaomi.setModel("zaebis");

        System.out.println(meizu.getModel());
        System.out.println(xiaomi.getModel());
    }


}
