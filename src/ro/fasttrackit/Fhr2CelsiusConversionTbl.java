package ro.fasttrackit;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Fhr2CelsiusConversionTbl {
    public static void main(String[] args) {

        int lowFahrenheit=0;
        int highFahrenheit=0;
        float degCelsius=0;
        int degFahrenheit=0;
        DecimalFormat df = new DecimalFormat("###.#");

        Scanner kbdNumber = new Scanner(System.in);

        System.out.println("Introduceti limita inferioara grade F:");
        lowFahrenheit=kbdNumber.nextInt();

        System.out.println("Introduceti limita superioara grade F:");
        highFahrenheit=kbdNumber.nextInt();

        System.out.println("===== Tabela conversie =====\n||    F      ||    C      ||");

        for (degFahrenheit = lowFahrenheit; degFahrenheit <= highFahrenheit; degFahrenheit++){
            degCelsius=(float)(degFahrenheit-32)*5/9;
            System.out.println("     " + degFahrenheit + "          " + df.format(degCelsius));

        }
    }
}

