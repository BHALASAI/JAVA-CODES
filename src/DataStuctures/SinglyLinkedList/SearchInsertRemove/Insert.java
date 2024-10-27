package DataStuctures.SinglyLinkedList.SearchInsertRemove;

import DataStuctures.SinglyLinkedList.LeetCode.AddTwoNumbers.ListNode;

public class Insert {

    static ListNode obj =new ListNode();
    static ListNode head = new ListNode();



    private static void insertHead(int value) {
        obj = new ListNode(value);
        obj.next = head.next;
        head.next = obj;
    }

    private static void multipleInsert(int[] value) {
        for (int j : value) {
            obj = new ListNode(j);
            obj.next = head.next;
            head.next = obj;
        }
    }

    private static void insertTail(int value) {
        ListNode newNode = new ListNode(value);
        if (obj != null) {

            ListNode current = obj;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }


    public static void main(String... args) {

        int[] arr = {1, 23, 55, 4, 8, 97, 96, 32};

        insertHead(12);
        insertHead(25);

        multipleInsert( arr);

        insertTail(589612);
        insertHead(122);

        insertTail(58961);

        while (obj != null) {
            System.out.println(obj.val);
            obj = obj.next;
        }

    }
}
