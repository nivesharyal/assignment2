package Q4;

public abstract class Bank {
    private double BankA = 1000.00d;
    private double BankB = 1500.00d;
    private double BankC = 2000.00d;

    public abstract void getBalance();

    public double getA() {
        return BankA;
    }

    public void setA(double a) {
        BankA = a;
    }

    public double getB() {
        return BankB;
    }

    public void setB(double b) {
        BankB = b;
    }

    public double getC() {
        return BankC;
    }

    public void setC(double c) {
        BankC = c;
    }
}