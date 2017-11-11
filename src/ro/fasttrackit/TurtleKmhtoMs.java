package ro.fasttrackit;

import java.util.Scanner;

public class TurtleKmhtoMs {
    public static void main(String[] args) {

        int speedKmh=0;
        float speedMs=0;

        Scanner kbdNumber = new Scanner(System.in);

        System.out.println("Introduceti viteza testoasei ninja Km/h:");
        speedKmh=kbdNumber.nextInt();
        speedMs=(float)speedKmh*10/36;
        System.out.println("Viteza testoasei ninja in m/s:" + speedMs);
    }
}
