package String_04;

public class SubStringOfString {
    public static void main(String[] args) {
//        String s = "JaiShankar";
//        System.out.println(s.substring(3));
//        System.out.println(s.substring(1,5));  // print 1 to 5


        // All possible substring
        String str = "gopi";
        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                System.out.print(str.substring(i, j+1)+" ");
            }
            System.out.println();
        }
    }
}
