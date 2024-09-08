public class RecursiveFact {
    public static int factorial(int n){
        if( n == 0 || n == 1){
            return 1;
        } 
        int fact_nm1 = factorial(n-1);
        int fact = n * fact_nm1;
        return fact;
    }
    public static void main(String[] args) {
         System.out.println(factorial(5));
    }
    
}
