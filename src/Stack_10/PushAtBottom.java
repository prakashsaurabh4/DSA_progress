package Stack_10;

import java.util.Stack;

public class PushAtBottom {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        int ele = 60;
        System.out.println("Before:"+st);

        pushAtBottom(st,ele);

        System.out.println("After: " + st);
        reverseStack(st);

        System.out.println("After Reverse: " + st);

    }

    public static void reverseStack(Stack<Integer> st){
        if(st.size()<=1) return ;
        int top = st.pop();
        reverseStack(st);
        pushAtBottom(st,top);
    }

    public static void pushAtBottom(Stack<Integer> st,int ele){
        if(st.size()==0){  //Base Case
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,ele);
        st.push(top);
    }
}
