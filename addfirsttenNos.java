public class addfirsttenNos {
    public static void main(String[] args) {
        int n=3;
        int sum = 0;
        System.out.println(addNum(n,sum));
    }

    public static int addNum(int num,int sum){
        if(num == 0){
            return sum;
        }
        return sum = sum + num + addNum(num-1, sum);
    }
}
