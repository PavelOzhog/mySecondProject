package trenirovka12;

public class Main {
    public static void main(String[] args) {
        Operation operation1 = new Operation(4,6);
        operation1.sum(4, 7);
        operation1.print();

    Operation operation2 = new Operation();
    operation2.setA(6);
    operation2.setB(3);
    operation2.vichit();
    operation2.print1();

    }
}
