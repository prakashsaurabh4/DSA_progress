package String_04;

public class PlusOperatorInString {
    public  static void main(String[] args) {
        String s = "bhakti";
        //s = s.concat("hakti");
        s = s + " bhavan";
        System.out.println(s);

        String a = "abc";
        String b = " def";
        System.out.println(a + b);
        System.out.println("saurabh "+ 10 + 20);
        System.out.println(10 + 20 + "saurabh");
        System.out.println('A'+10+"hello");  // 65 + 10
        System.out.println("saurabh "+ (10 + 20));


    }
}
