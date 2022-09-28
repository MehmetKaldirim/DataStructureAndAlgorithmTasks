package LinkedListQuestion;

import java.util.Random;

public class Task02_LinkedLIstTwoAdd {

    public static void main(String[] args) {
        Random rand = new Random();
        ListNode nums1 = new ListNode();
        ListNode nums2 = new ListNode();
        for (int i = 0; i < 3; i++) {
            nums1.myAdd(rand.nextInt(10));
            nums2.myAdd(rand.nextInt(10));
        }

        nums1.myPrintNodes();
        nums2.myPrintNodes();
        System.out.println( "here both= "+  nums1.head.val + " " + nums2.head.val);
        ListNode head = ListNode.addTwoNumbers(nums1.head,nums2.head);
        ListNode.printWithHead(head);


    }


    //Creating a single link list from  Nodes,
    public static class ListNode {

        int val;
        ListNode next;
        ListNode head;
        ListNode tail;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        boolean isEmpty() {
            return head == null;
        }



        void myAdd(int num) {
            ListNode node = new ListNode(num);
            if (isEmpty()) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        void myPrintNodes() {
            ListNode current = head;
            while (current != null) {
                if (current.next == null) {
                    System.out.print(current.val + "=> null");
                } else {
                    System.out.print(current.val + "=>");
                }
                current = current.next;

            }
            System.out.println();

        }

        public static void printWithHead(ListNode head) {
            ListNode current = head;
            while (current != null) {
                if (current.next == null) {
                    System.out.print(current.val + "=> null");
                } else {
                    System.out.print(current.val + "=>");
                }
                current = current.next;

            }
            System.out.println();

        }

        public static ListNode myAddTwoNumbers(ListNode first, ListNode second) {
            ListNode myHead = null;

            return myHead;
        }

        public static ListNode addTwoNumbers(ListNode first, ListNode second) {
            int carry = 0;
            int reminder = 0;
            int sum = 0;
            ListNode h = null;
            ListNode temp = null;
            while (first != null || second != null) {
                sum =
                        carry +
                                (
                                        ((first != null) ? first.val : 0) +
                                                ((second != null) ? second.val : 0)
                                );
                reminder = sum % 10;
                carry = sum / 10;
                ListNode newNode = new ListNode(reminder);


                if (h == null) {
                    h = newNode;
                } else {
                    temp = h;
                    while (temp.next != null) {
                        temp = temp.next;
                    }
                    temp.next = newNode;
                    newNode.next = null;
                }
                if (first != null) {
                    first = first.next;
                }
                if (second != null) {
                    second = second.next;
                }
            }
            if (carry > 0) {
                ListNode newNode = new ListNode(carry);
                temp = h;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
                newNode.next = null;
            }
            return h;
        }
    }
}

/*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
*/