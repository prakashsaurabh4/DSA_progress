package LinkedList_09;

import java.util.Scanner;

import static java.lang.reflect.Array.get;

class Nodes{
    int val; // data
    Nodes next;
    Nodes(int val){
        this.val = val;
    }
}
public class DisplayList {
    public static void displayRec(Nodes head) {
        if (head == null) return;
        System.out.print(head.val + " ");  // Printing start to end
        displayRec(head.next);
        System.out.print(head.val + " ");   // Printing reverese

    }

    public static void display(Nodes head) {

        //Not good Method
//        System.out.print(head.val+" ");
//        System.out.print(head.next.val+" ");
//        System.out.print(head.next.next.val+" ");
//        System.out.print(head.next.next.next.val+" ");
//        System.out.print(head.next.next.next.next.val+" ");
//        System.out.print(head.next.next.next.next.next.val+" ");

        //Using While Loop
        Nodes temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }
    //Using For loop
//        for(Nodes node=head;node!=null;node=node.next){
//        System.out.print(node.val + " ");
//        }
//        System.out.println();
//    }

    // Get node value at index (0-based)
    private static int get(Nodes head, int idx) {
        Nodes temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public static void main(String[] args) {

        Nodes a = new Nodes(100);
        Nodes b = new Nodes(200);
        Nodes c = new Nodes(300);
        Nodes d = new Nodes(400);
        Nodes e = new Nodes(500);
        Nodes f = new Nodes(600);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // display(a);   // Both Printing the List
        //displayRec(a); // Both Printing the List

        //   Node n = null; //Not assign null

        System.out.println(get(a, 1));


    }
}
