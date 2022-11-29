package Recursion;

import java.util.*;

public class josephus {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println("Winner is "+ joseph(n, k));
    }

    //Mapping method
    public static int winner(int n,int k){
        if(n==1){
            return 1;
        }
        return (winner(n-1, k)+(k-1))%n;
    }

    //Array Method
    public static int joseph(int n, int k){
        List<Integer> people = new ArrayList<Integer>();
        int index =0;

        for(int i=0;i<n;i++){
            people.add(i+1);
        }

        while(people.size()>1){
            index = index + k-1;
            if(index>=people.size()){
                index= index%people.size();
            }
            people.remove(index);
        }

        return people.get(0);
    }
}
