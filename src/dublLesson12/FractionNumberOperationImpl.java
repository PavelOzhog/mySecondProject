package dublLesson12;

public class FractionNumberOperationImpl implements FractionNumberOperation {



    @Override
    public FractionNumberImpl add(FractionNumber a, FractionNumber b) throws NullPointerException {
        int commonDivisor = a.getDivisor() * b.getDivisor();
        int resultChisl = (a.getDividend() * b.getDivisor()) + (a.getDivisor() * b.getDividend());

        FractionNumberImpl result = new FractionNumberImpl();
        result.setDivisor(commonDivisor);
        result.setDividend(resultChisl);

        return result;
    }

    @Override
    public FractionNumberImpl sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        int commonDivisor = a.getDivisor() * b.getDivisor();
        int resultChisl = (a.getDividend() * b.getDivisor()) - (a.getDivisor() * b.getDividend());

        FractionNumberImpl result = new FractionNumberImpl();
        result.setDivisor(commonDivisor);
        result.setDividend(resultChisl);

        return result;

    }

    @Override
    public FractionNumberImpl mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        int commonDivisor = a.getDivisor() * b.getDivisor();
        int resultChisl = (a.getDividend() * b.getDividend());

        FractionNumberImpl result = new FractionNumberImpl();
        result.setDivisor(commonDivisor);
        result.setDividend(resultChisl);

        return result;
    }

    @Override
    public FractionNumberImpl div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        int commonDivisor = a.getDivisor() * b.getDividend();
        int resultChisl = (a.getDividend() * b.getDivisor());

        FractionNumberImpl result = new FractionNumberImpl();
        result.setDivisor(commonDivisor);
        result.setDividend(resultChisl);

        return result;
    }
}
