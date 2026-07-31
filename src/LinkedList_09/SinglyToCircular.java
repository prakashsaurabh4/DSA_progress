package LinkedList_09;

class Node3 {
    int data;
    Node3 next;
    Node3(int d) {
        data = d;
        next = null;
    }
}

class SinglyToCircular {

    // Convert singly linked list to circular
    Node3 circular(Node3 head) {
        if (head == null) return null;

        Node3 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head; // last node points back to head

        return head;
    }

    // Print circular linked list
    void printList(Node3 head) {
        if (head == null) return;

        System.out.print(head.data + " ");
        Node3 temp = head.next;

        while (temp != head) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Build singly linked list from array
    Node3 buildList(int[] arr) {
        if (arr.length == 0) return null;

        Node3 head = new Node3(arr[0]);
        Node3 temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node3(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        SinglyToCircular sol = new SinglyToCircular();

        int[] arr = {1, 2, 3, 4, 5};

        // Build singly linked list
        Node3 head = sol.buildList(arr);

        // Convert to circular
        head = sol.circular(head);

        // Print circular linked list
        sol.printList(head);  // Output: 1 2 3 4 5
    }
}