package ro.fasttrackit;

public class Power {
    public static void main(String[] args) {

        int a = 2;
        int pow = 8;
        int b = 1;

        if (pow==0){
            b=1;
        } else
            for (int i=0; i<pow; i++){
            b=b*a;
        }

        System.out.println(a + "^" + pow + "=" + b);

    }
}
