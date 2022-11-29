package Recursion;

public class pallindrome {
    public static void main(String[] args) {
        String str = "aba";
        System.out.println(isPallindrome(str,0,str.length()-1));
    }

    public static boolean isPallindrome(String str, int low, int high){
        if(low>=high){
            return true;
        }
        if(str.charAt(high)!=str.charAt(low)){
            return false;
        }
        return isPallindrome(str, low+1, high-1);
    }
}
