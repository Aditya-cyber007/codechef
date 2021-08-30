package Codechef;

import java.util.Scanner;

public class OddRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int S = sc.nextInt();
            int[] arr1 = new int[N];
            int[] arr2 = new int[N + K - 1];
            int j = 1;
            int sum = 0;
            for (int i = 0; i < N; i++) {
                arr1[i] = j;
                sum = sum + j;
                j = j + 2;
            }
            for (int i = 0; i < N; i++) {
                if (arr2[i] * (K - 1) == S - sum) {
                    System.out.println(arr2[i]);

                }
            }
        }

    }
}

