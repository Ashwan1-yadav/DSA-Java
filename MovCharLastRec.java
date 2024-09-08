public class MovCharLastRec {
    public static void moveAtlast(String str,int i,int count,String newStr){
        if(i == str.length()){
            for(int j = 0 ; j < count;j++){
               newStr += "x";  
            }
            System.out.println(newStr);
            return;
        }
        char currentchar =  str.charAt(i);
        if(currentchar == 'x'){
            count++;
            moveAtlast(str, i+1, count, newStr);
        } else {
            newStr += currentchar;
            moveAtlast(str, i+1, count, newStr);
        }

    }

    public static void main(String[] args) {
        String str = "abxxcxxdxex";
        moveAtlast(str, 0, 0, "");
    }
}
