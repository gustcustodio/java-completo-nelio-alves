package secao08IntroducaoPOO.util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double dollarToReal(double dollarPrice, double amount) {
        return dollarPrice * amount + (dollarPrice * amount * IOF);
    }
}
