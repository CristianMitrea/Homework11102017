package ro.fasttrackit;

public class Apartine {
    public static void main(String[] args) {

        int n = 30;
        boolean apartine = true;

        if (n>=9 && n<=24) {
            apartine = true;
        } else {
            apartine = false;
        }

        System.out.println(n + " apartine intervalului [9-24]: " + apartine);
    }
}
