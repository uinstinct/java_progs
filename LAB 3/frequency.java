import java.util.*;

class frequency {
    static int count(int arr[], int sear) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++)
            if (sear == arr[i])
                counter++;
        return counter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements you want in array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " has " + count(arr, arr[i]));
        }

        sc.close();
    }
}