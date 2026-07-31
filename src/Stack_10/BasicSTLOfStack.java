package Stack_10;

import java.util.Stack;

public class BasicSTLOfStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println(st.size()==0);
        st.push("Ram");
        st.push("Shyam");
        st.push("Sita");
        st.push("Anshu");
        st.push("Payal");

        System.out.println(st.size());
        System.out.println(st);  //Auxilary space = O(n)
        st.pop();
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());  // It return the topmost element and then removes it
    }
}
