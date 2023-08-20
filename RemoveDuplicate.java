import java.util.*;
public class RemoveDuplicate {
    public static void duplicate (String s,int i,StringBuilder newstr,boolean map[]) {

        if(i==s.length()) {
            System.out.println(newstr);
            return;
        }
        char currstr = s.charAt(i);
        
        if(map[currstr-'a']==true) {
            duplicate(s,i+1,newstr,map);
            } else {
                map[currstr-'a']=true;
              duplicate(s,i+1,newstr.append(currstr),map);  
            }

    }
    public static void main(String[] args) {
        String s= "apnacollege";
        duplicate(s,0,new StringBuilder(""),new boolean[26]);
    }
}