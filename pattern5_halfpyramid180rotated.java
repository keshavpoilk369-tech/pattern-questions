package Aimaster;
import java.util.Scanner;
public class pattern5_halfpyramid180rotated {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //nested loop
        for(int i = 1; i <= n; i++){
            //inner loop -->>for printing spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //inner loop for printing stars
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
