package ArraysRecursion;

import PlayWithInterfaces.A;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 23, 4, 51, 6, 51, 8};
//        System.out.println(find(arr, 51, 0));
//        System.out.println(findIndex(arr, 51, 0));
//        System.out.println(findIndexLast(arr, 51, arr.length - 1));
////        findAllIndex(arr, 51, 0);
////        System.out.println(list);
//        ArrayList<Integer> ans = findAllIndex(arr, 51, 0, new ArrayList<>());
//        System.out.println(ans);

        System.out.println(findAllIndex2(arr, 51, 0));
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

    static int findIndexLast(int[] arr, int target, int index) {
        //base condition
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index) {
        //base condition
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index); //whenever you find answer, just add it to ArrayList
        }
        //just call the rest of the array
        findAllIndex(arr, target, index + 1);
    }

    // now w/o using ArrayList as a separate space outside the method
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        //base condition
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index); //whenever you find answer, just add it to ArrayList
        }
        return findAllIndex(arr, target, index + 1, list); // here list is being returned in every function call
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        //not a good approach bcoz you are creating AL again and again
        ArrayList<Integer> list = new ArrayList<>();
        //base condition
        if (index == arr.length) {
            return list;
        }
        //this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index); //whenever you find answer, just add it to ArrayList
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1); // when is this recursion call coming out? When stack is getting empty, i.e. when it is going above above above. So, ansFromBelowCalls will have calls from answers that are coming from below. It add answers to itself on every recursion call
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
