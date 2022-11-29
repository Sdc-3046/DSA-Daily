/*
  0
 101
21012
 101
  0
*/

public class patternprint {
    public static void main(String[] args) {
        int n = 3;

        for(int i =0 ;i<=n;i++){
            for(int k=0;k<(n-i);k++){
                System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                System.out.print(k);
            }
            for(int j = 0;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=(n-1);i>=0;i--){
            for(int k=0;k<(n-i);k++){
                System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                System.out.print(k);
            }
            for(int j = 0;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
