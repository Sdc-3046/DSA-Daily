public class pallindrome{
    public static void main(String[] args) {
        int a = 414;
        int b = 0;
        int copy = a;
        while(a>0){
            int c = a%10;
            //System.out.print(b);
            b = b*10+c;
            a = a/10;
        }
        if(copy == b){
            System.out.println("Number is pallindrome");
        }
        else{
            System.out.println("Number is not pallindrome");
        }        
    }
}