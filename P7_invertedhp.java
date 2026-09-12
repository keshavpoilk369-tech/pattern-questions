package Aimaster;
import java.util.Scanner;
public class P7_invertedhp {
    static void main() {
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();

        //-->> nested loop -->> outer loop
        for(int i = 1; i <= n; i++){
            //-->> inner loop
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
