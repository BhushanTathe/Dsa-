package array;
import java.util.Scanner;
public class Twodarray {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter no of rows and column in array resp:");
        int row = input.nextInt();
        int column = input.nextInt();

        int[][] arr=new int[row][column];

        System.out.println("Enter elemnts of array rowise:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
            {
              int no = input.nextInt();
              arr[i][j]=no;
            }
        }

        System.out.println("Elements of array are:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("Enter no to check its present or not in array:");
        int n = input.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++){
                if(arr[i][j]==n)
                {
                    System.out.println(arr[i][j]+" present at "+(i)+" row and "+(j)+" column");
                }

            }
        }


    }
}
