package ro.fasttrackit;

public class SumaNrNaturale {
    public static void main(String[] args) {
        int n = 20;
        int sum = 0;

        for (int i=0; i < n; i++ ) {
            sum += i;
        }
        System.out.println("Suma primelor " + n + " de numere naturale: " + sum);
    }
}
