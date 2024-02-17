package Recursion;

public class FiboNo {
    public static int fiboNo(int n){
        if(n<2){
            return n;
        }
        return fiboNo(n-1) + fiboNo(n-2);
    }

    public static void main(String[] args){

        int ans = fiboNo(4);
        System.out.println(ans);

    }
}
