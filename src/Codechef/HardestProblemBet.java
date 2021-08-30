package Codechef;
import java.util.*;
import java.lang.*;
/* Name of the class has to be "Main" only if the class is public. */
public class HardestProblemBet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-- >0){
            int S1,S2,S3;
            S1=sc.nextInt();
            S2=sc.nextInt();
            S3=sc.nextInt();

            if(S3<S2 && S3<S1){
                System.out.println("Alice");
            }
            else if(S2<S1 && S2<S3){
                System.out.println("Bob");
            }
            else{
                System.out.println("Draw");
            }
        }
    }
}
