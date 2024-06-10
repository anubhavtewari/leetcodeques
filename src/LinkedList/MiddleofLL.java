//package LinkedList;
//
//public class MiddleofLL {
//    /**
//     * Definition for singly-linked list.
//     * public class ListNode {
//     *     int val;
//     *     ListNode next;
//     *     ListNode() {}
//     *     ListNode(int val) { this.val = val; }
//     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//     * }
//     */
//    class Solution {
//        public ListNode middleNode(ListNode head) {
//            // ListNode node = head;
//            // int len = 1;
//            // while(node.next != null){
//            //     len++;
//            //     node = node.next;
//            // }
//            // System.out.println(len);
//            // node = head;
//            // for(int i = 0; i < len/2 ; i++){
//            //     node = node.next;
//            // }
//            // return node;
//
//            ListNode fast = head;
//            ListNode slow = head;
//            while(fast != null && fast.next !=null){
//                slow = slow.next;
//                fast = fast.next.next;
//            }
//            return slow;
//        }
//    }
//}
