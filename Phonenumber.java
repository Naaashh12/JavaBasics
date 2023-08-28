public class Phonenumber {
    public static void possiblewords(String s,String ans) {
        String[] keypad = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        if(s.length()==0) {
            System.out.println(ans);
            return;
        }

        String key=keypad[s.charAt(0)-48];

        for(int i =0; i<key.length();i++) {
            possiblewords(s.substring(1),ans+key.charAt(i));

        }

    }
    public static void main(String[] args) {
        
        possiblewords("2","");
    }
}