package Stack_10;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class MyStack{
    Node head;
    int len;
    int peek() {
        return head.val;
    }
    int pop(){ //Delete at Head
        if(head == null){
            System.out.println("Stack is empty");
        }
        int x = head.val;
        head = head.next;
        len--;
        return x;
    }
    void push(int ele){ //Add at Head
        Node temp = new Node(ele);
        if(len==0) head = temp;
        else {
            temp.next = head;
            head = temp;
        }
        len++;
    }
    int size(){
        return len;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LLImplementationOfStack {
    public static void main(String[] args) {
        int ele = 60;
        MyStack st  = new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();

        st.push(ele);
        st.display();

        st.pop();
        st.display();

    }
}
