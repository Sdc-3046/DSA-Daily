public class findOnlynonrepeatingele {
    public static void main(String[] args) {
        int []arr = {6,7,9,1,7,6,1};
        int answer = 0;
        for(int i=0;i<arr.length;i++){
            answer = answer ^ arr[i];
        }
        System.out.println("Only non-repeating number in the given array is "+answer);
    }
}
