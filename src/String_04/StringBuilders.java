package String_04;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Saurabh");
        System.out.println(s.length()+" "+s.capacity());  // capacity 16
        System.out.println(s);
        s.append("Prakash");
        System.out.println(s);
    }
}
