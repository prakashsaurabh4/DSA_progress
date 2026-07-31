package LinkedList_09;

class Node1{  // user defined data type
    int val;
    Node1 next;
    Node1(int val){
        this.val = val;
    }
}

class LinkedList { // user defined data Structure
    Node1 head;  // null
    Node1 tail;  // null
    int size;

    int search(int val) {
        if (head == null) return -1;
        Node1 temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.val == val) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    void addAtTail(int val) {
        Node1 temp = new Node1(val);
        if (tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }


    void display() {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addAtHead(int val) {
        Node1 temp = new Node1(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insert(int val, int idx) {
        if (idx < 0 || idx > size) System.out.println("Invalid Index");
        else if (idx == 0) addAtHead(val);
        else if (idx == size) addAtTail(val);
        else {
            Node1 temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            Node1 newNode = new Node1(val);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    int get(int idx) {
        Node1 temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    void delete(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid Index");
            return;
        }
        if (idx == 0) {
            deleteAtHead();
        }

        Node1 temp = head;
        for(int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(idx == size-1) tail = head;
        size--;

    }
}

//    LinkedList(){
//        head = tail = null;
//    }


public class LinkedListInDataStructure {
    public static void main(String[] args) {
     LinkedList ll = new LinkedList();
     ll.addAtTail(10);
     ll.addAtTail(20);
     ll.addAtTail(30);
     ll.addAtTail(40);
     ll.display();
    ll.addAtHead(50);
    ll.addAtHead(60);
    ll.display();
    ll.deleteAtHead();
    ll.display();
        System.out.println(ll.size);


    ll.insert(60,3);
    ll.display();

        System.out.println(ll.get(4));

        ll.delete(3);


    }
}
