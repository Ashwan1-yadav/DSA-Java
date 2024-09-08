public class RecRemoveDup {
    public static boolean[] map = new boolean[26];
    public static void removeduplicate(String str, int i,String newStr){
        if(i==str.length()){
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(i);
        if(map[currentChar - 'a']){
            removeduplicate(str, i+1, newStr);
        } else {
            newStr += currentChar;
            map[currentChar - 'a'] = true;
            removeduplicate(str, i+1, newStr);
        }
    }
    public static void main(String[] args) {
        String str = "helloorld";
        removeduplicate(str, 0, "");
    }
}
