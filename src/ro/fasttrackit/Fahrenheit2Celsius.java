package ro.fasttrackit;
import java.util.Scanner;

public class Fahrenheit2Celsius {
    public static void main(String[] args) {
        float degCelsius=0;
        int degFahrenheit=0;

        Scanner kbdFahrenheit = new Scanner(System.in);
        System.out.println("Introduceti temperatura in grade Fahrenheit:");

        degFahrenheit=kbdFahrenheit.nextInt();
        degCelsius=(degFahrenheit-32)*5/9;

        System.out.println("Grade Fahrenheit:" + degFahrenheit);
        System.out.println("Grade Celsius:" + degCelsius);
    }
}
