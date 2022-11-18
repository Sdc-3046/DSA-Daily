public class clearkthbit {
    public static void main(String[] args) {
        int a = 12;// 1100 ->1000 ->8
        int k= 2;
        int mask = ~(1<<k);
        a = a & mask;
        System.out.println(a);
    }
}
