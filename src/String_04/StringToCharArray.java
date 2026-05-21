package String_04;

import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {
        String str = "abcde";
        char[] arr = str.toCharArray();
        for(char ch : arr ) {
            System.out.println(ch);
        }
    }
}
