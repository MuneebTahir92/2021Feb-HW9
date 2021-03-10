package algorithms;

public class SelectionSort {

    public static void main(String[] args) {

        int [] array = {30, 70, 100, 20, 40, 200, 10};

        for(int i=0; i<array.length; i++){
            int blank = i;
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[blank]){
                    blank = j;
                    int small = array[blank];
                    array[blank] = array[i];
                    array[i] = small;
                }
            }
        }

        for(int n=0; n<array.length; n++){
            System.out.println(array[n]);
        }
    }
}
