package trenirovka12;

public class Operation implements Operations{

private int a;
private int b;




public Operation () {
}

public Operation ( int a, int b){
    this.a = a;
    this.b = b;
}

public void setA (int a) {
    this.a = a;
}

public int getA (){
    return a;
}

    public int getB() {
        return b;
    }

    public Operation setB(int b) {
        this.b = b;
        return this;
    }





    @Override
    public int sum(int a, int b) {
        this.a = a;
        this.b = b;
        int summ = a + b;
return summ;
}

    @Override
    public int vichit() {
        return a - b;
    }

    public void print (){
        System.out.println(" сумма чисел равна "  + this.sum(a,b));
    }

public void print1(){
    System.out.println("hfpyjcnm " + this.vichit());
}
}
