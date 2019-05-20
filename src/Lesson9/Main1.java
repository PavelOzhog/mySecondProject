package Lesson9;

public class Main1 {
    public static void main(String[] args) {
        Phone meizu = new Phone();
        Phone xiaomi = new Phone();

        Phone leagoo = new Phone();
        meizu.setPrice(10000);
        xiaomi.setPrice(80000);
        System.out.println(meizu.getPrice());


        meizu.setDiagonal(4.5);
        xiaomi.setDiagonal(5.5);




        leagoo.setModel("ipone");
        System.out.println(leagoo.getModel());

        System.out.println(meizu.getDiagonal());
        System.out.println(xiaomi.getPrice());







    }
}
