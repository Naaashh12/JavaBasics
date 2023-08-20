public class Tiles {
    public static int tile(int n) {
        if(n==0||n==1)//if there is no box then there are 0 ways of fitting the tile 
        //which is already case
        return 1;
    
        int horizontatiles=tile(n-2);
        int verticaltiles=tile(n-1);
        int totaltile= horizontatiles+verticaltiles ;
        return totaltile;

    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(tile(n));
    }
}