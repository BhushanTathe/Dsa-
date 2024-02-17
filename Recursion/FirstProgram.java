package Recursion;

public class FirstProgram {
         public static void printNumb(int n){
             //base case is mandatory and it should includes return.
             if(n==0){
                 return;
             }
             System.out.println(n);
             printNumb(n-1);
         }


    public static void main(String[] args){

             int n = 5;
             printNumb(n);


    }

}
