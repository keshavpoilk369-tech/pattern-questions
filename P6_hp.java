package Aimaster;
import java.util.Scanner;
public class P6_hp {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //nested loop -->> outer loop
        for(int i = 1; i <= n; i++){
            //-->> inner loop
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
