package Recursion;

public class sumofNnaturalnos {
    public static void main(String[] args) {
        int n =10;
        System.out.println("Sum of first "+n+" natural numbers is "+sum(n));
    }

    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n + sum(n-1);
    }
    
}
