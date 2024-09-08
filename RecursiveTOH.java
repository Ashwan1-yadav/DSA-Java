public class RecursiveTOH {
    public static void towerOfHanoi(int n,String src,String helper ,String des){
        if(n==1){
            System.out.println("Move disk 1 from source "+src+" to destination "+des);
            return;
        }
       towerOfHanoi(n-1, src, des, helper);
       System.out.println("transfered "+ src +" to"+"destination");
       towerOfHanoi(n-1, helper, src, des);

    }
      public static void main(String[] args) {
        towerOfHanoi(2,"A" , "B", "C");
      }
}
