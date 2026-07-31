package LinkedList_09;

class Node{
    int val; // data
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class NodeOfLinkedList {
    public static void main(String[] args) {
        // 10 20 30 40 50  storing the data
//        Node a = new Node(); a.val = 10;
//        Node b = new Node(); b.val = 20;
//        Node c = new Node(); c.val = 30;
//        Node d = new Node(); d.val = 40;
//        Node e = new Node(); e.val = 50;
//
//        // Connecting the Node(Linking)
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;


        //Another method
        Node a = new Node(10); //LinkedList_09.Node@8efb846 (Head Node)
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        System.out.println(c.next);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(a.next.next.next.val);

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.next);
        System.out.println(b.next);
        System.out.println(a.next.next);



    }
}
