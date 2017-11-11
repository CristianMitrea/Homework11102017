package ro.fasttrackit;

public class ClujFloresti {
    public static void main(String[] args) {


    float vFlorica = 45; //viteza in Km/h
    float vIon = 100;
    float K = 12; // distanta in kilometri
    float timpIntalnire;
    float distdeCluj;


    timpIntalnire = K * 60 / (vFlorica + vIon);
    distdeCluj = vIon * timpIntalnire /60;

        System.out.println("Timp de intalnire in minute:" + timpIntalnire);
        System.out.println("Distanta de Cluj in Km:" + distdeCluj);

    }


}
