package Recursion;


public class findnoofpaths {
    public static void main(String[] args) {
        int m = 51;
        int n = 9;
        System.out.println(numberOfpaths(m, n));
    }

    public static int numberOfpaths(int m,int n){
        if(m==1 || n==1){
            return 1;
        }
        return numberOfpaths(m-1, n) + numberOfpaths(m, n-1);
    }
}
