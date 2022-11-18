public class findpairofnonrepeating {
    public static void main(String[] args) {
        int []arr = {6,7,9,1,7,6};
        int []arr1 = new int [arr.length];
        int []arr2 = new int [arr.length];
        
        int ans=0,ans1=0,ans2=0;
        
        for(int i=0;i<arr.length;i++){
            ans = ans ^ arr[i];
        }

        // 8 = 1000
        int index = 0;
        while(ans>0){
            if((ans & 1)==1){
                break;
            }
            index++;
            ans = ans>>1;
        }
        int index1=0,index2=0;
        for(int i=0;i<arr.length;i++){
            if(((arr[i]>>index)&1)==1){
                arr1[index1]=arr[i];
                index1++;
            }
            else{
                arr2[index2]=arr[i];
                index2++;
            }
        }
        for(int i=0;i<arr1.length;i++){
            ans1 = ans1 ^ arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            ans2 = ans2 ^ arr2[i];
        }
        System.out.println("Pair of non-repeating numbers is ("+ans1+","+ans2+")");
    }
}
