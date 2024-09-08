public class Recursion {
    public static void print(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        print(i+1, n, sum);

    }

    public static void main(String[] args) {
        print(1,10,0);
    }
}
