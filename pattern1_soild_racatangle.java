package Aimaster;
import java.util.Scanner;
public class pattern1_soild_racatangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //-->> For rows
        int b = sc.nextInt(); // -->> For columns

        //using nasted loop
        //outer loop
        for(int i =1; i <= a; i++){
            //inner loop
            for(int j = 1; j <= b; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
