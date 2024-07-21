package ArraysRecursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 23, 4, 51, 6, 7, 8};
        System.out.println(find(arr, 51, 0));
        System.out.println(findIndex(arr, 51, 0));
    }

    static boolean find(int[] arr, int target, int index) {
        //base condition
        if (index == arr.length) { //i.e. of index reaches outside the arr, so we haven't found the target, so return false
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1); //either the index I'm currently at is the answer or either the target should exist in the other par of the array
    }

    static int findIndex(int[] arr, int target, int index) {
        //base condition
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

}