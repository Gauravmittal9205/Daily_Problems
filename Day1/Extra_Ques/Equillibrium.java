package Extra_Ques;

import java.util.*;

public class Equillibrium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findEquilibrium(arr));
        sc.close();

    }

    public static int findEquilibrium(int arr[]) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int n = arr.length;
        left[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            left[i] = left[i - 1] + arr[i];
        }
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] + arr[i];
        }
        for (int i = 0; i < n; i++) {
            if (left[i] == right[i]) {
                return i;
            }
        }
        return -1;
    }

}
