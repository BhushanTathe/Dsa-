package Sorting;

public class Selectionsort{

    public static void main(String[] args){


        int[] arr={10, 3,15, 1};


        for(int i=0; i< arr.length-1; i++){
            int minidx=i;
            for(int j=i+1; j<arr.length; j++){
                if (arr[minidx] > arr[j]) {
                    minidx = j;
                }
                int temp = arr[i];
                arr[i]=arr[minidx];
                arr[minidx] = temp;
            }
        }

        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }






    }
}
