public class gcd{
    public static void main(String[] args) {
        int a =15;
        int b =12;

        System.out.println("GCD is "+calcGCD(a,b));
    }
    public static int calcGCD(int a, int b){
        if(b==0){
            return a;
        }
        return calcGCD(b, a%b);
    }
}