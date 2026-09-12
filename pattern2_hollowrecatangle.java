package Aimaster;
import java.util.Scanner;
public class pattern2_hollowrecatangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();

        //-->> nasted loop
        //-->>outer loop
        for(int i = 1; i <= k; i++){
          //inner loop
          for(int j = 1; j <= s; j++){
              if(i==1 || i==k || j==1|| j==s ){
                  System.out.print("*");
              }else{
                  System.out.print(" ");
              }
          }
            System.out.println();
        }
        sc.close();
    }
}
