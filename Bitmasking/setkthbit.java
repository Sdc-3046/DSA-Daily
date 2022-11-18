public class setkthbit {
    public static void main(String[] args) {
        int a = 8;// 1000 -> 1100 ->12
        int k= 2;
        int mask = 1<<k;
        a = a|mask;
        System.out.println(a);
    }
}
