public class BitMan {
    public static void main(String[] args) {
        int num = 10;
        int position = 3;
        int Bitmask = 1>>position;
        if((Bitmask & num) == 0){
            System.out.println("Bit at position "+position+" is 0");
        } else {
            System.out.println("Bit at position "+position+" is 1");   
        }
         
    }
}
