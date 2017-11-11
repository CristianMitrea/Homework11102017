package ro.fasttrackit;

public class Factorial {
    public static void main(String[] args) {
        int factorial = 1;
        int n = 3;

        if (n==0){
            factorial=1;
        } else {
            for (int i=n; i>0; i-- ) {
                factorial = factorial * i;
            }
        }

        System.out.println("factorial(" + n + ")=" + factorial);

    }
}
