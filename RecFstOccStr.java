public class RecFstOccStr {
    public static int first = -1;
    public static int last = -1;
    public static void firstandlastOcc(String str,char ele,int i){
        if(i==str.length()){
            return;
        }
        if(str.charAt(i)==ele)
        {
            if(first == -1){
                first = i;
            } else {
                last = i;
            }
        }
        firstandlastOcc(str,ele,i+1);
    }
    public static void main(String[] args) {
        String str = "Saaransh";
        char ele = 'a';
        firstandlastOcc(str,ele,0);
        System.out.println("First Occurrence of "+ele+" is at index "+first);
        System.out.println("Last Occurrence of "+ele+" is at index "+last);

    }
}
