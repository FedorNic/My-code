package Home_Tasks.HT_17;

class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class MyLinkedList {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addFirst(12);
        myLinkedList.addFirst(26);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(52);
        ListNode all = myLinkedList.addFirst(32);
        myLinkedList.display();
        myLinkedList.removeFirst(all);
        myLinkedList.display();
        myLinkedList.removeFirst(all);
        myLinkedList.display();
        myLinkedList.removeFirst(all);
        myLinkedList.display();
    }

    public ListNode head;

    public void display() {
        // The printing method of a single linked list is the same way
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public ListNode addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head != null) {
            node.next = this.head;
        }
        this.head = node;
        return node;
    }

    public ListNode removeFirst(ListNode node) {
        if (this.head != null) {
            this.head = head.next;
        }
        return node;
    }

    // Tail insertion method
//    public void addLast(int data){
//        ListNode node = new ListNode(data);
//        if(this.head == null) {
//            this.head = node;
//            this.last = node;
//        }else {
//            this.last.next = node;
//            node.prev = this.last;
//            this.last = node;
//        }
//    }


    // Delete the node with keywords for the first time
//    public void remove(int key){
//        ListNode cur = this.head;
//        while (cur != null) {
//            if(cur.val == key) {
//                if(cur == head) {
//                    head = head.next;
//                    if(head != null) {
//                        head.prev = null;
//                    }else {
//                        last = null;
//                    }
//                }else {
//                    cur.prev.next = cur.next;
//                    if(cur.next != null) {
//                        //centre position
//                        cur.next.prev = cur.prev;
//                    }else {
//                        last = last.prev;
//                    }
//                }
//                return;
//            }
//            cur = cur.next;
//        }
//    }


    //jps   jmap -histo:live XXXX > c:\\bit.txt
//    public void clear() {
//        while (head != null) {
//            ListNode curNext = head.next;
//            head.next = null;
//            head.prev = null;
//            head = curNext;
//        }
//        last = null;
//    }
}