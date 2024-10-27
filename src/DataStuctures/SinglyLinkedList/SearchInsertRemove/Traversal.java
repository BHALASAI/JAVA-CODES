package DataStuctures.SinglyLinkedList.SearchInsertRemove;

import DataStuctures.SinglyLinkedList.LeetCode.AddTwoNumbers.ListNode;

public class Traversal {


    public static void traverseLinkedList(ListNode l1){

        ListNode current = l1;

        while (current != null) {

            System.out.print(current.val + " ");
            current = current.next;
        }

        System.out.println();

    }
    public static void main(String ...args){

        ListNode obj = new ListNode();
        ListNode head = new ListNode();

        for(int i=1; i<=5; i++) {
            obj = new ListNode(i*10);
            obj.next = head.next;
            head.next = obj;
        }

        traverseLinkedList(obj);

    }
}
