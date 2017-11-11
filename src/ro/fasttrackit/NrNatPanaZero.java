package ro.fasttrackit;

import java.util.Scanner;

public class NrNatPanaZero {
    public static void main(String[] args) {

        int Number=0;
        int sumNumbers=0;
        int counter = 0;
        boolean notStop=true;

        Scanner kbdNumber = new Scanner(System.in);
        System.out.println("Introduceti doar numere naturale. Pentru a va opri introduceti 0");

        while ( notStop ) {
            System.out.println("Introduceti numarul:");
            Number=kbdNumber.nextInt();
            if (Number < 0){
                System.out.println("Introduceti un numar natural!");
            } else {
                if (Number != 0) {
                    if (Number>4 && Number<11) {
                        sumNumbers = sumNumbers + Number;
                        counter++;
                    }
                } else {
                    notStop = false;
                }
            }
        }

        if ( counter == 0 ) {
            System.out.println("Nu ati introdus numere naturale 4<n<11, suma este 0");
        } else {
            System.out.println( "Aceasta este suma pentru 4<n<11 : " + sumNumbers );
        }
    }
}
