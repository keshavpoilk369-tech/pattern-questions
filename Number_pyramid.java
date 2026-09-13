package Aimaster;
import java.util.Scanner;
public class Number_pyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();

        for(int i = 1; i <= a; i++){
            //-->> print space
            for(int j = 1; j <= a-i; j++ ){
                System.out.print(" ");
            }
            //-->> print number
            for(int j = 1; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
