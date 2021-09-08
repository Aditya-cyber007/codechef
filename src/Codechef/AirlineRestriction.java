package Codechef;

import java.util.Scanner;

public class AirlineRestriction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0){
            int A,B,C,D,E;
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();
            D = sc.nextInt();
            E = sc.nextInt();
            if ((A+B)<= D && C <= E) {
                System.out.println("YES");
            }
            else if ((B+C)<= D && A <= E) {
                
                System.out.println("YES");
            }
            else if ((C+A)<= D && B <= E) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
