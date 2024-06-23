package SlidingWindow;
/*
Given an array A[] of size N and a positive integer K, find the first negative integer for each and every window(contiguous subarray) of size K.
 Example 1:
Input :
N = 5
A[] = {-8, 2, 3, -6, 10}
K = 2
Output :
-8 0 -6 -6
Explanation :
First negative integer for each window of size k
{-8, 2} = -8
{2, 3} = 0 (does not contain a negative integer)
{3, -6} = -6
{-6, 10} = -6

Example 2:
Input :
N = 8
A[] = {12, -1, -7, 8, -15, 30, 16, 28}
K = 3
Output :
-1 -1 -7 -15 -15 0

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(K)
 */
public class FirstNegativeIntegerinEveryWindowOfSizeK {
    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int N = arr.length, K = 3;

    }
//    class Compute {
//
//        public long[] printFirstNegativeInteger(long A[], int N, int K)
//        {
//            return firstNegativeNumber(A,K);
//        }
//
//        private static long[] firstNegativeNumber(long[] nums, int k) {
//            ArrayList<Long> list = new ArrayList<>();
//            long[] arr = new long[nums.length-k+1];
//            if(k>nums.length) return null;
//            int start=0,end=0,index=0;
//            while (end<nums.length){
//                if(nums[end]<0) list.add(nums[end]);
//                if(end-start+1 <k){
//                    end++;
//                } else if (end-start+1 ==k) {
//                    if (list.isEmpty()) {
//                        arr[index++] = 0;
//                    }
//                    else {
//                        arr[index++] = list.get(0);
//                        if(nums[start]<0) list.remove(0);
//
//                    }
//                    start++;
//                    end++;
//
//                }
//            }
//            return arr;
//        }
//
//
//    }

}
