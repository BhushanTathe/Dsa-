package Sorting;

public class Bubblesort {
    public static void main(String[] args){
        int n = 4;
        int[] arr = {1,2,3,4};
        boolean swap = false;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    swap = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        if(swap==false){
            System.exit(0);
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }


    }
}
