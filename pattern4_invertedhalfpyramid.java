package Aimaster;
import java.util.Scanner;
public class pattern4_invertedhalfpyramid {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //using nested loop
        //inner loop
        for (int i = n; i >= 1; i--){
            //inner loop
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
