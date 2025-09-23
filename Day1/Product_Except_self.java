package Day1;

import java.util.*;

public class Product_Except_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < productExceptSelf(arr).length; i++) {
            System.out.print(productExceptSelf(arr)[i] + " ");
        }
        sc.close();
    }

    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int res[] = new int[n];
        left[0] = 1;
        right[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * arr[i - 1];

        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }
        for (int i = 0; i < n; i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }

}
