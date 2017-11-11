package ro.fasttrackit;
import java.util.Scanner;

public class VAT {
    public static void main(String[] args) {
        float Price=0;
        float VAT=0;
        float noVATPrice=0;

        Scanner kbdPrice = new Scanner(System.in);
        System.out.println("Introduceti pretul:");

        Price=kbdPrice.nextFloat();
        noVATPrice = Price*100/119;
        VAT = Price*19/119;

        System.out.println("Pret:" + Price);
        System.out.println("Pret fara TVA:" + noVATPrice);
        System.out.println("TVA:" + VAT);
    }
}
