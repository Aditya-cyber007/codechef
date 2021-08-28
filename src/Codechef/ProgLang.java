package Codechef;
import java.util.*;

public class ProgLang {
    public static void main (String[] args) throws Exception
    {
        //input  test_case
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {

            int A, B, A1, B1, A2, B2; // these are features
            A = sc.nextInt();
            B = sc.nextInt();
            A1 = sc.nextInt();
            B1 = sc.nextInt();
            A2 = sc.nextInt();
            B2 = sc.nextInt();

            // to check availability
            if ((A == A1 || A == B1) && (B == A1 || B == B1)) {
                System.out.println(1);
            } else if ((A == A2 || A == B2) && (B == A2 || B == B2)) {

                System.out.println(2);
            } else {

                System.out.println(0);
            }
        }
    }
}
