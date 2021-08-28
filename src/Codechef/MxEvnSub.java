package Codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class MxEvnSub {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int sum = 0;

            for (int i = 1; i <= N; i++) {
                sum = sum + i;
            }
            if (sum % 2 == 0) {
                System.out.println(N);
            } else {
                N--;
                for (int i = 1; i <= N; i++) {
                    sum = sum + i;
                }
                if (sum % 2 == 0) {
                    System.out.println(N);
                } else {
                    N--;
                    for (int i = 1; i <= N; i++) {
                        sum = sum + i;
                    }
                    System.out.println(N+1);
                }
            }
        }
    }
}
