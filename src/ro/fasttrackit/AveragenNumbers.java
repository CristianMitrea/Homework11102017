package ro.fasttrackit;

import java.util.Scanner;

public class AveragenNumbers {
    public static void main(String[] args) {

        float avgNumbers=0;
        int nNumbers=0;
        int sumNumbers=0;


        Scanner kbdNumber = new Scanner(System.in);

        System.out.println("Pentru cate numere doriti sa calculati media?");
        System.out.println("Introduceti n:");
        nNumbers=kbdNumber.nextInt();

        int [] Numbers = new int[nNumbers];

        for (int i = 0; i < nNumbers; i++){
            if ( i==0 ){
                System.out.println("Introduceti primul numar:");
                Numbers[i]=kbdNumber.nextInt();
            } else
                if (i  < nNumbers-1){
                    System.out.println("Introduceti al " +(i+1)+"-lea numar:");
                    Numbers[i]=kbdNumber.nextInt();
                } else {
                    System.out.println("Introduceti ultimul numar:");
                    Numbers[i]=kbdNumber.nextInt();
                }
        }

        System.out.println("Acestea au fost numerele alese:");
        for (int j = 0; j < Numbers.length; j++){
            System.out.print( Numbers[j] + " ");
            sumNumbers = sumNumbers + Numbers[j];
        }

        avgNumbers = (float)sumNumbers/Numbers.length;
        System.out.println( "\nAceasta este media: " + avgNumbers );


    }

}
