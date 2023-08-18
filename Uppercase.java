import java.util.*;
public class Uppercase {
    public static String converttouppercase(String s) {
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(s.charAt(0)));

        for(int i=1;i<s.length();i++) {
            if(s.charAt(i)==' '&& i<s.length()-1) {
            sb.append(s.charAt(i));
            i++;
            sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="hi i am nashrat";
        System.out.println(converttouppercase(str));

    }
}