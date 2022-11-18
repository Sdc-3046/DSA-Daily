public class bitwise {
    public static void swap(int a, int b){
        System.out.println("a="+a+" b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping:");
        System.out.println("a="+a+" b="+b);
    }


    public static void main(String[] args) {
        int a=6;
        int b=8;
        int res = (a ^ b);
        System.out.println(res);
        swap(a,b);
    }
}
