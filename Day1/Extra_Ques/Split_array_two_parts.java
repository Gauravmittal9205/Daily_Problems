package Extra_Ques;

import java.util.*;

public class Split_array_two_parts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(canSplit(arr));
        sc.close();
    }

    public static boolean canSplit(int arr[]) {
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = arr[0];
        right[n - 1] = arr[n - 1];
        for (int i = 1; i < n; i++) {
            left[i] = arr[i] + left[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] + arr[i];
        }
        int j = 0;
        int k = 1;
        while (j < n - 1 && k < n) {
            if (left[j] == right[k]) {
                return true;
            }
            j++;
            k++;
        }
        return false;

    }
}