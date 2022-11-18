//import java.util.*;

public class findkthbit {
    public static void main(String[] args) {
        int k=1; // find 'k'th bit
        int a=12;//1100
        
        // method 1: using bit mask
        /*int mask=1;
        mask = 1<<k;
        int ans = a & mask;
        if(ans>0){
            System.out.println(k+"th bit was set");
            return;
        }
        else{
            System.out.println(k+"th bit was zero");
            return;
        }      */  

        //method 2: using right shift operation
        a = (a>>k)&1;
        System.out.println(k+"th bit is "+a);
    }
}
