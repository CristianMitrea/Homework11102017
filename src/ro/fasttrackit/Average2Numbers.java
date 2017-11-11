package ro.fasttrackit;
import java.util.Scanner;

public class Average2Numbers {
    public static void main(String[] args) {

            float avg2Numbers=0;
            int firstNumber=0;
            int secondNumber=0;

            Scanner kbdNumber = new Scanner(System.in);

            System.out.println("Introduceti primul numar:");
            firstNumber=kbdNumber.nextInt();

            System.out.println("Introduceti al doilea numar:");
            secondNumber=kbdNumber.nextInt();

            avg2Numbers=(float)(firstNumber + secondNumber)/2;

            System.out.println("Primul numar:" + firstNumber);
            System.out.println("Al doilea numar:" + secondNumber);
            System.out.println("Media:" + avg2Numbers);

    }
}
