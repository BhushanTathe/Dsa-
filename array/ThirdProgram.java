package array;
import java.util.Arrays;
import java.util.Scanner;


public class ThirdProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        //toString works for 1d array                                         2d array --> [1, 2, 3]  <-- 0th row index contains whole array
        //                                                                                 [4, 5, 6]  <-- 1st row index
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        //deepToString method works for 2dimensional array
        System.out.println(Arrays.deepToString(arr));
    }
}
