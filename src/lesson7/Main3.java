package lesson7;



public class Main3 {
    public static void main(String[] args) {
        System.out.println("Какую опреацию необходимо сделать");
      String operation =  Calculator.getOperation();
        System.out.println(operation);

        System.out.println("введите первое число");
        int num = Calculator.getNumber();


        System.out.println("введите второе число");
        int num2 = Calculator.getNumber();

        Calculator.result(operation,num,num2);

    }
}
