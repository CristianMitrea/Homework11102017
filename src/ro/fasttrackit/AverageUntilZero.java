package ro.fasttrackit;
import java.util.Scanner;

public class AverageUntilZero {
    public static void main(String[] args) {
        float avgNumbers=0;
        int Number=0;
        int sumNumbers=0;
        int counter = 0;
        boolean notStop=true;

        Scanner kbdNumber = new Scanner(System.in);
        System.out.println("Introduceti numerele. Pentru a va opri introduceti 0");

        while ( notStop ) {
            System.out.println("Introduceti numarul:");
            Number=kbdNumber.nextInt();
            if ( Number != 0) {
                sumNumbers = sumNumbers + Number;
                counter++;
            } else {
                notStop = false;
            }
        }

        if ( counter == 0 ) {
            System.out.println("Nu ati introdus numere, media este 0");
        } else {
            avgNumbers = (float)sumNumbers/counter;
            System.out.println( "\nAceasta este media: " + avgNumbers );
        }

    }
}
