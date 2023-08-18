public class SubString {
    public static String sub(String str,int si,int ei) {
            String st="";
            for(int i=si;i<ei;i++) {
                st+=str.charAt(i);
            }
            return st;
    }
    public static void main(String[] args) {
        String s="HELLOWORLD";
        System.out.println(sub(s,0,5));
    }
}