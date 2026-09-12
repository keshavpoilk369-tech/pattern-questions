package Aimaster;
import java.util.Scanner;
public class P8_floydtringle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 1;

        for(int i = 1; i <= n; i++){
            //inner loop
            for(int j = 1; j <= i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        sc.close();
    }
}
