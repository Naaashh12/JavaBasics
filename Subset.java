public class Subset {
    public static void findsubset(String s,String ans, int i) {
        //base-condition
        if(i==s.length()) {
            if(s.length()==0) {
                System.out.println("null");
            }
            else {
            System.out.println(ans);
            }
            return;
        }
        //recursion
        findsubset(s,ans+s.charAt(i),i+1);
        findsubset(s,ans,i+1);
        //backtracking
        


    }
    public static void main(String[] args) {
        String str="abc";
        findsubset(str," ",0);

    }
}