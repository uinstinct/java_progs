import java.util.*;

class diagonal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int m = 3, n = 3;

        int[][] arr = new int[m][n];

        System.out.println("Enter the elements");
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum1 = arr[0][0] + arr[1][1] + arr[2][2];
        int sum2 = arr[0][2] + arr[1][1] + arr[2][1];
        int sum = sum1 + sum2;

        System.out.println("left diagonal elements " + sum1);

        System.out.println("diagonal elements " + sum2);

        System.out.println("right diagonal elements " + sum);

        sc.close();
    }
}