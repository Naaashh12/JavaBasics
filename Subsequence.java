import java.util.*;
public class Subsequence {
    public static void getsub (String s,String res) {
        if(s.length()==0) {
            System.out.println(res);
            return  ;
        }
        //picking
        getsub(s.substring(1),res+s.charAt(0));
        //not picking
        getsub(s.substring(1),res);
       findsub(res,0);
    }
    public static void findsub (String res,int i) {
        
        if (res.charAt(i)==res.charAt(res.length()-1))
        {
            
           System.out.println(res);
        }
        

    }
    public static void main(String[] args) {
        String s="abcab";
        getsub(s,"");

    }
}