//package LinkedList;
//
//public class PalindromeLL {
//
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
//
//        public ListNode reverse(ListNode head){
//            ListNode prev = null;
//            ListNode curr = head;
//
//            while(curr !=null){
//                ListNode next = curr.next;
//                curr.next = prev;
//                prev = curr;
//                curr = next;
//            }
//            return prev;
//        }
//
//        public ListNode findMiddle(ListNode head){
//            //find middle using two pointers
//            ListNode slow = head;
//            ListNode fast = head;
//            while(fast.next != null && fast.next.next != null){
//                fast = fast.next.next;
//                slow = slow.next;
//            }
//            return slow;
//        }
//
//        public boolean isPalindrome(ListNode head) {
//            //reverse second half of linked list
//            // Find middle of Linked List
//            //1. Find middle of LL
//            //2. Reverse 2nd half
//            //3. Check 1st half & 2nd half
//            if(head == null || head.next == null){
//                return true;
//            }
//            ListNode mid = findMiddle(head); //1st half ka end
//            ListNode secondHalfStart = reverse(mid.next);
//            ListNode firstHalfStart = head;
//            while(secondHalfStart != null){
//                if(secondHalfStart.val != firstHalfStart.val){
//                    return false;
//                }
//                firstHalfStart = firstHalfStart.next;
//                secondHalfStart = secondHalfStart.next;
//            }
//            return true;
//        }
//    }
//}
