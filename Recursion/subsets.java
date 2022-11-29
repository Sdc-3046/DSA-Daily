package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    public static void main(String[] args) {
        String str = "abcd";
        List<String> list = new ArrayList<>();
        subsets(str,0,"",list);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }

    public static void subsets(String str,int index,String currStr,List<String> list){
        if(index==str.length()){
            list.add(currStr);
            //System.out.println(currStr);
            currStr = "";
            return;
        }
        subsets(str, index+1, currStr + str.charAt(index),list);
        subsets(str, index+1, currStr,list);
    }
}
