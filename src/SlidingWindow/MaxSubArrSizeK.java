/*
Find maximum (or minimum) sum of a subarray of size k

Given an array of integers and a number k, find the maximum sum of a subarray of size k.

Examples:
Input  : arr[] = {100, 200, 300, 400},  k = 2
Output : 700

Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4
Output : 39
Explanation: We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.

Input  : arr[] = {2, 3}, k = 3
Output : Invalid
Explanation: There is no subarray of size 3 as size of whole array is 2.
 */
package SlidingWindow;

public class MaxSubArrSizeK {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println("Maximum sum of subarray with size "+k+" is: "+maxSubArraySizeK(arr,k));
    }
    public static int maxSubArraySizeK(int[] arr, int k){
//        int start = 0, end = 0, max = Integer.MIN_VALUE;
//        int sum = 0;
//        while (end < arr.length){
//            sum+= arr[end];
//            if(end - start +1 < k){
//                end++;
//            }
//            else if(end - start +1 == k){
//                max = Math.max(max, sum);
//                sum-=arr[start];
//                end++;
//                start++;
//            }
//        }
//        using for loop
        int start = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            // Check if the current window has reached size k
            if (end - start + 1 == k) {
                max = Math.max(max, sum); // Update max if the current sum is greater
                sum -= arr[start]; // Subtract the element at the start of the window
                start++; // Move the start of the window to the right
            }
        }
        return max;
    }
}