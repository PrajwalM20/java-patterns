import java.util.*;
import java.util.Scanner;

public class SoildRhombus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        for(int i =1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                 System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
           
        }
    
    }
}