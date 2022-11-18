import java.util.Arrays;

public class primenumbers {
    public static void main(String[] args) {
        int number = 100;

        //method 1: division method
        /*if(number <= 1){
            System.out.println("Number is not prime");
            return;
        }
        if(number == 2){
            System.out.println("Number is prime");
            return;
        }
        for(int i=2;i<=number/2;i++){
            if(number % i ==0){
                System.out.println("Number is not prime");
                return;
            }
        }
        System.out.println("Number is prime");
        return;
        */

        //method: array method
        boolean []arr=new boolean[number+1];
        Arrays.fill(arr,true);
        arr[0]=arr[1]=false;
        for(int i=2;i<=number/2;i++){
            int k=2;
            while(i*k<=number){
                arr[i*k]=false;
                k++;
            }
        }
        int test = 81;
        if(arr[test]==true){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
}
