package Searching;

public class LinearSearch {

    public static int Search(int[] arr, int target){

        if(arr==null){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){

        int [] arr = {10,70,20,3,50,53,15};
        int target = 3;

        int search = Search(arr, target);
        System.out.println(search);


    }



}
