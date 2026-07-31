package OOPS_08;

import java.util.Arrays;

public class Marks {
    public static class StudentData{
        String name;
        int roll;
        int size;
        int[] marks;
        StudentData(int[] s){
            marks = Arrays.copyOf(s,s.length);
        }
        StudentData(int s){
            marks=new int[s];
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,7,1,4,8};

        StudentData s1=new StudentData(4);
        s1.marks[0] = 40;
        System.out.println(arr[0]);
       StudentData s2=new StudentData(2);
       s2.marks[0] = 40;
       s2.marks[1] = 30;
        System.out.println(s2.marks[0]+" "+s2.marks[1]);
//        s1.marks[0]=89;
//        s1.marks[1]=90;
//        s1.marks[2]=91;
//        s1.marks[3]=92;




    }
}
