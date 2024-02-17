package Pattern;
import java.util.Scanner;

public class patterntwo {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;

//        pattern1
//        while(i<=n){
//            int j=1;
//            while(j<=i){
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//      pattern2
//        while(i<=n){
//            int j=1;
//            while(j<=i){
//                System.out.print(i+j-1);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(i+j-1);
                j++;
            }
            System.out.println();
            i++;
        }





    }

}
