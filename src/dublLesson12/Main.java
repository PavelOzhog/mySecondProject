package dublLesson12;

public class Main {
    public static void main(String[] args) {
        FractionNumberImpl number1 = new FractionNumberImpl(1, 4);
        FractionNumberImpl number2 = new FractionNumberImpl();
        number2.setDividend(3);
        number2.setDivisor(5);

        FractionNumberOperationImpl operation = new FractionNumberOperationImpl();
        FractionNumberImpl resultAdd = operation.add(number1, number2);
        resultAdd.printToConsole();


        FractionNumberOperationImpl operationSub = new FractionNumberOperationImpl();
        FractionNumberImpl resultSub = operation.sub(number1, number2);
        resultSub.printToConsole();

        FractionNumberOperationImpl operationMul = new FractionNumberOperationImpl();
        FractionNumberImpl resultMul = operationMul.mul(number1, number2);
        resultMul.printToConsole();

        FractionNumberOperationImpl operationDiv = new FractionNumberOperationImpl();
        FractionNumberImpl resultDiv = operationDiv.div(number1, number2);
        resultDiv.printToConsole();


    }
}
