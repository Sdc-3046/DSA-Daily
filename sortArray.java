// given array = [2,4,6,8,10]
// expected array = [10,2,8,4,6]

import java.util.*;

public class sortArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []arr =new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int []ans = new int[size];
        int index=0;
        boolean flag = false;
        int low=0, high = size-1;

        while(low<=high){
            if(flag){
                ans[index] = arr[low];
                low++;
                index++;
                flag = false;
            }
            else{
                ans[index]=arr[high];
                high--;
                index++;
                flag = true;
            }
        }

        //printing the expected output
        for(int i=0;i<size;i++){
            System.out.print(ans[i]+" ");
        }
    }
}

