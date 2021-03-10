package algorithms;

public class InsertionSort {

    public static void main(String[] args) {

        int [] array = {30, 70, 100, 20, 40, 200, 10};
        int blank = 0;

        for(int i=0; i<array.length; i++){
            for(int j=i; j>0; j--){
                if(array[j]<array[j-1]){
                    blank = array[j];
                    array[j] = array[j-1];
                    array[j-1] = blank;
                }
            }
        }

        for(int n=0; n<array.length; n++){
            System.out.println(array[n]);
        }
    }
}
