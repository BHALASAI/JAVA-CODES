package DataStuctures.SinglyLinkedList.LeetCode.AddTwoNumbers;

public class Main {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode result = res;

        int carry = 0;
        while (l1 != null || l2 != null || carry!=0) {

            int sum = 0;
            sum += l1 != null ? l1.val : 0;
            sum += l2 != null ? l2.val : 0;
            sum += carry;

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }

            carry = sum / 10;

            result.next = new ListNode(sum % 10);
            result = result.next;
        }

        return res.next;
    }

    public static void main(String... args) {
        Main obj = new Main();


//        scenario - 1
//        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);
//
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);

//        scenario - 2
//        ListNode l1 = new ListNode(0);
//        ListNode l2 = new ListNode(0);

//        scenario - 3
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next= new ListNode(9);
        l1.next.next.next= new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);

        ListNode ll = obj.addTwoNumbers(l1, l2);

        while (ll != null) {
            System.out.println("*************************************************");
            System.out.println(ll.val);
            ll = ll.next;
        }


    }
}
