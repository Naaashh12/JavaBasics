import java.util.*;

public class ReverseStrStk {
    
    public static String reversestring(String str) {
        Stack <Character> s = new Stack<>();
        int idx=0;
        while(idx<str.length()) {
            s.push(str.charAt(idx)); 
            idx++;         
        }
        StringBuilder ans = new StringBuilder("");
        while(!s.isEmpty()) {
        char top = s.pop();
        //reversestring( str, idx++);
        ans.append(top);
        }
        return ans.toString();

    }

    /*public static String reversestringrecursion(String str, int idx) {
        if (str.length()==0||str.length()<=1) {
            return str;
        }

        Stack<Character> s = new Stack<>();

        s.push(str.charAt(idx));

        Char top = s.pop(str.cha) ;


    }*/
    public static void main(String[] args) {
        String str = "richa";
        String reverse=reversestring(str);
        System.out.print(reverse);
    }
    
}
