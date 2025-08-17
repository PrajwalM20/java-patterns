import java.util.*;
public class Palindrome{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();      // int n = 4;
         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                 System.out.print(j + " ");
            }for (int j = i - 1; j >= 1; j--) {
                 System.out.print(j + " ");
            }
            System.out.println(); 
    
        }
    }
}
