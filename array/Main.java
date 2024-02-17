package array;
import java.util.Scanner;

public class Main {

    public static void main(String args[])
    {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = input.nextInt();

        int[] arr=new int[size];

        System.out.println("Enter Elements of array:");
        for (int i=0;i<size;i++)
        {
            int no=input.nextInt();
            arr[i]=no;
        }

        System.out.println("Check no is present or not in array:");
        int n = input.nextInt();
        for(int i=0;i<size;i++)
        {
            if(arr[i]==n) {
                System.out.print((arr[i]+" is present at ")+(i+1)+(" position"));
            }

        }

    }
}
