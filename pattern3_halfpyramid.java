package Aimaster;
import java.util.Scanner;
public class pattern3_halfpyramid {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //using nasted loop
        //outer loop

        for(int i = 1; i <= n; i++){
            //inner loop
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
