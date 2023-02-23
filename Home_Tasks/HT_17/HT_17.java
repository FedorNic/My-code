package Home_Tasks.HT_17;

import java.util.Iterator;
import java.util.LinkedList;

public class HT_17 {
    public static void main(String[] args) {
        ListNode head = new ListNode(6, new ListNode(3, new ListNode(1, new ListNode(7))));

        for (Integer integer : head) {
            System.out.println(integer);
        }

//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.addFirst(5);

        ListNode two = head.next; //отсчет со второго элемента
        for (Integer integer : two) {
            System.out.println(integer);
        }
    }
    //1. Реализовать методы addFirst, removeFirst.

    public static class ListNodeUtils {
        private ListNode head;

        public void addFirst(int value) {
            ListNode node = new ListNode(value);
            if (this.head == null) {
                this.head = node;
            } else {
                node.next = this.head;
                this.head = node;
            }
        }
//
//
//
//        }
//
//        public static ListNode removeFirst(ListNode node) {
//            // TODO: 19.01.2023
//        }
    }
    public static class ListNode implements Iterable<Integer> {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public Iterator<Integer> iterator() {
            ListNode node = this;
            return new ListNode.ListNodeIterator(node);
        }

        private static class ListNodeIterator implements Iterator<Integer> {
            private ListNode node;

            public ListNodeIterator(ListNode node) {
                this.node = node;
            }

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public Integer next() {
                int toReturn = node.val;
                node = node.next;
                return toReturn;
            }

        }
    }

//    public static class ListNodeUtils {
//
//        //2.Реализовать методы разворота связного списка.
//        public static ListNode reverse(ListNode node) {
//            // TODO: 19.01.2023
//        }
//    }
}