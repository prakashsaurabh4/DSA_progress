package String_04;

public class PassingStringToMethod {
    public static void change(String x){
        x = "Prakash";   // String are immutable
    }
    public static void main(String[] args) {
        String  x = "Saurabh";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
