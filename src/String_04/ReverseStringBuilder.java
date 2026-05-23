package String_04;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        String s = "Mohan";
        StringBuilder sb = new StringBuilder(s);
       // System.out.println(sb.reverse());

//        int i =0,j=sb.length()-1;
//        while(i<=j){
//            char temp1 = sb.charAt(i);
//            char temp2 = sb.charAt(j);
//            sb.setCharAt(i,temp2);
//            sb.setCharAt(j,temp1);
//            i++;j--;
//
//        }
//        System.out.println(sb);

//        sb.deleteCharAt(1);
//        System.out.println(sb);
//        sb.insert(1,'e');
//        System.out.println(sb);
//        sb.delete(2,6); //2 to 5
//        System.out.println(sb);

        String s1 = "Shyam";
        StringBuilder sb2 = new StringBuilder(s1);
        sb2.reverse();
        s1 = sb2.toString();
        System.out.println(s1);
    }
}
