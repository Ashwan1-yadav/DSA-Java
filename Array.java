import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("Enter row no : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Enter col no : ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter elements in array : ");
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        System.out.println("Enter no to be search : ");
        int num = sc.nextInt();
        System.out.println();
        
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++){
                if(arr[i][j] == num){
                   System.out.println("Number "+num+ " found at index "+i+","+j);
                }
            }
        }    
        sc.close();
    }
}
