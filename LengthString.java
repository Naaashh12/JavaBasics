public class LengthString {
    public static int countlength(String s,int i) {
        if(i==s.length()) {
            return -1;
        }
        
        int count=countlength(s,i+1);
        count++;
        return count;
        
    }
    public static void main(String[] args) {
        String s="Hello";
        System.out.println(countlength(s,-1));

    }
}