//package LinkedList;
///*
//Remove Nth Node From End of List
//Given the head of a linked list, remove the nth node from the end of the list and return its head.
//Input: head = [1,2,3,4,5], n = 2
//Output: [1,2,3,5]
// */
//public class RemoveNthNodeFromEnd {
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
//        public ListNode removeNthFromEnd(ListNode head, int n) {
//            if(head.next == null){
//                return null;
//            }
//            //size
//            int size = 1;
//            ListNode curr = head;
//            while(curr.next != null){
//                curr = curr.next;
//                size++;
//            }
//            if(n == size){
//                return head.next;
//            }
//            int indexToSearch = size - n;
//            ListNode prev = head;
//            int i = 1;
//            while(i < indexToSearch){
//                prev = prev.next;
//                i++;
//            }
//            prev.next = prev.next.next;
//            return head;
//        }
//    }
//}
