package ro.fasttrackit;

public class SearchSortedArray {
    public static void main(String[] args) {
        int[] sortedArray = {1,3,4,6,7,8,10,12,14,23};
        int index = 0;
        int first = 0;
        int counter = 0;
        int mynumber = 5;
        int last = sortedArray.length -1;
        boolean searchComplete = false ;


        while ( first != last && !searchComplete){
            index = first + ( last - first )/2;
            counter++;
            System.out.println("index:" + index + "last" + last + "first" + first + "counter" + counter);
            if (mynumber == sortedArray[index]){
                    searchComplete = true;
                System.out.println("Numarul a fost gasit pe pozitia :" + index + "dupa" + counter + "incercari");
            } else {
                if( mynumber < sortedArray[index] ){
                        last = index;
                } else {
                    first = index;
                }
            }
        if ( first == last) {
            System.out.println("Numarul nu apartine sirului");
        }
        }

    }
}
