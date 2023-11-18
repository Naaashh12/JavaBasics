import java.util.*;
public class Anagram {

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        if(s.length()!=t.length()) {
            return false;
        }
        //ch= s.charAt(0)
        for(int i =0; i<s.length();i++) {
            Character ch= s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i =0; i<t.length();i++) {
            char ch= t.charAt(i);
        if(hm.get(ch)!=null){
            if(hm.get(ch)==1) {
                hm.remove(ch);
            } else {
                hm.put(ch, hm.get(ch)-1);
            }
        } else {
            return false;
        }
    }
    return hm.isEmpty();

    }
    public static void main (String[] args){
        String s ="heart";
        String t = "earth";

        System.out.print(isAnagram(s,t));
    }
}
