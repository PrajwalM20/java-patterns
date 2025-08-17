import java.util.*;

public class SandGlass{
    // 1. Right-Angled Triangle Pattern
    public static void main(String[] args){
         Scanner sc =  new Scanner(System.in);
         int n = sc.nextInt();  // int n = 5;
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < i; j++) System.out.print(" ");
                 for (int j = i; j < n; j++) System.out.print("* ");
                     System.out.println();
             }
             for (int i = n - 1; i >= 0; i--) {
                 for (int j = 0; j < i; j++) System.out.print(" ");
                      for (int j = i; j < n; j++) System.out.print("* ");
                        System.out.println();
                }
            }
        }









// // upper part
// 
//    
// // lower part
// 