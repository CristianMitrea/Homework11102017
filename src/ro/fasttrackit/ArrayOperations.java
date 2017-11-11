package ro.fasttrackit;

public class ArrayOperations {
    public static void main(String[] args) {


        int[] array = {5, 6, 7, 22, 5, 11, 1, 4};
        int [] doubledarray = new int[array.length];

        int minim = array [0];
        int maxim = array[0];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (maxim < array[i]) {
                maxim = array[i];
            }
        }

        for (int j = 0; j < array.length; j++) {
            if (minim > array[j]) {
                minim = array[j];
            }
        }

        for (int k = 0; k < array.length; k++) {
            sum = sum + array[k];
        }

        for (int l = 0; l < doubledarray.length; l++) {
            doubledarray [l] = array[l]*2;
        }

        System.out.println("Acesta este mimimul:" + minim);
        System.out.println("Acesta este maximul:" + maxim);
        System.out.println("Acesta este sirul original:");
        for (int m = 0; m < array.length; m++){
            System.out.print( array[m] + " ");
        }

        System.out.println("\nAcesta este sirul dublat:");
        for (int n = 0; n < doubledarray.length; n++){
            System.out.print( doubledarray[n] + " ");
        }
    }
}
