package Recursion;

public class powerCalculation {
    public static void main(String[] args) {
        int a = 15;
        int b = 2;
        System.out.println(power(a, b, 1));
    }

    public static int power(int a, int b, int ans){
        if(b==0){
            return ans;
        }
        ans = ans*a;
        return power(a, b-1, ans);
    }
}
