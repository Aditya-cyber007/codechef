package Codechef;
import java.util.Scanner;
import java.lang.String;

public class TravelPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0){
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            sc.nextLine();
            String S = sc.nextLine();
            int count1=0 , count0 = 0;
            char[] ch = S.toCharArray();
            for (int i = 0; i < N; i++) {
                char a=ch[i];
                if (a=='1'){
                    count1++;
                }
                else if (a=='0'){
                    count0++;
                }

            }
            System.out.println((count0*A) + (count1*B));
        }
    }
}