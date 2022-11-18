public class findingnoofsetbits {
    public static void main(String[] args) {
        int a = 12;
        int count=0;

        //method 1 : n&(n-1)
        /*while(a>0){
            a = a & (a-1);
            count++;
        }
        */

        //method 2 : right shift
        
        while(a>0){
            if((a&1)==1){
                count++;
            }
            a=a>>1;
        }

        System.out.println(count);
    }
}
