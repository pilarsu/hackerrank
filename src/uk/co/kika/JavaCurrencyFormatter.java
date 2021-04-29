package uk.co.kika;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Sample Input
 * 12324.134
 *
 * Sample Output
 * US: $12,324.13
 * India: Rs.12,324.13
 * China: ￥12,324.13
 * France: 12 324,13 €
 */
public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale usLocale = new Locale("en", "US");
        NumberFormat currencyFormatterUs = NumberFormat.getCurrencyInstance(usLocale);
        String us = currencyFormatterUs.format(payment);

        Locale inLocale = new Locale("en", "IN");
        NumberFormat currencyFormatterIn = NumberFormat.getCurrencyInstance(inLocale);
        String india = currencyFormatterIn.format(payment);

        Locale chLocale = new Locale("zh", "CN");
        NumberFormat currencyFormatterCh = NumberFormat.getCurrencyInstance(chLocale);
        String china = currencyFormatterCh.format(payment);

        Locale frLocale = new Locale("fr", "FR");
        NumberFormat currencyFormatterFr = NumberFormat.getCurrencyInstance(frLocale);
        String france = currencyFormatterFr.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
