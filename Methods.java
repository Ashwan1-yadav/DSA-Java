import java.util.Scanner;

public class Methods {
    public static int fact(int n){
        int fact = 1;
       if(n<0){
         System.err.println("Number should not be less then 0");
         return -1;
       } else if(n==0){
         return 0;
       } else {
        for(int i = n ; i>=1 ; i--){
           fact = fact * i;
        }
        
       }
       return fact;
    }
    public static void main(String args[]){
       System.out.println("Enter value of n :");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println("Factorial of "+n+" is "+fact(n));
       sc.close();
    }
}
