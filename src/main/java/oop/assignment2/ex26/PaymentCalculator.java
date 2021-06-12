package oop.assignment2.ex26;

public class PaymentCalculator {
    public static int OtherMethod(double balance, int APR, double payments) {
        double APR2 = (APR/100.0)/365.0;
        double months = (-(1.0/30.0) * Math.log(1.0 + balance/payments * (1.0 - Math.pow(1.0 + APR2, 30)))) / Math.log(1.0 + APR2);
        months = Math.ceil(months);
        return (int)months;
    }
}
