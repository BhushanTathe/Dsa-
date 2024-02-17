package Recursion;

public class ThirdProgram {

    public static void PrintNo(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        PrintNo(n+1);
        System.out.println(n-1);
    }

    public static void main(String[] args){

        PrintNo(1);




    }


}
