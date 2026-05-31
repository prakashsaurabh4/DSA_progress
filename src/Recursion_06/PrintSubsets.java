package Recursion_06;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsets {  //Important
    public void main(String[] args) {
        String s = "abc";
        List<String> list = new ArrayList<String>();
        subsets("",s,0,list);
        System.out.print(list);

    }

    private static void subsets(String ans,String s,int index, List<String> list){
        if(index==s.length()){
           if(ans.length() != 0) list.add(ans);
            return;
        }
        char ch = s.charAt(index);
        subsets(ans+ch,s,index+1,list); //pick
        subsets(ans,s,index+1,list); //skip

    }
}
