package Aimaster;
import java.util.Scanner;
public class Hollow_butterfly {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //-->> upper part -->> first half
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(j == 1 || j == i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //-->> Middle space
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            //-->> second half
            for(int j = 1; j <= i; j++){
                if(j == 1 || j == i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //upper part
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                if(j == 1 || j == i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //-->> Middle space
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            //-->> second half
            for(int j = 1; j <= i; j++){
                if(j == 1 || j == i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
