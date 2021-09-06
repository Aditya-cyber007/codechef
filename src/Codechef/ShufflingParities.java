package Codechef;

import java.util.Scanner;

public class ShufflingParities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0){
            int N = sc.nextInt();
            int[] arrA = new int[N];
            for (int i = 0; i < N; i++) {
                arrA[i]=sc.nextInt();
            }
            int even_count=0, odd_count=0;
            int even1 = N/2;
            int odd1 = N/2 +N%2;
            for (int i = 0; i <N; i++) {
                if (arrA[i]%2==0){
                    even_count++;
                }
                else{
                    odd_count++;
                }
            }
            int max_sum=0;
            if ((even_count-odd1)>0){
                max_sum=even_count-odd1;
            }
            else if ((odd_count-even1)>0){
                max_sum=odd_count-even1;
            }
            System.out.println(N-max_sum);
        }
    }
}
