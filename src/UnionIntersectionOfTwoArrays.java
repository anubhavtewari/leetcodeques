/*
arr1 = {7,3,9}
arr2 = {6,3,9,2,9,4}
union = 6 {7,3,9,6,2,4}
 */

import java.util.HashSet;

public class UnionofTwoArrays {
    public static void union(int[] arr1, int[] arr2){ // O(n)
        HashSet<Integer> hs = new HashSet<>();
        for (int j : arr1) {
            hs.add(j);
        }
        for (int j : arr2) {
            hs.add(j);
        }
        System.out.println("Size of set: "+ hs.size());
        for(int e : hs){
            System.out.print(e +" ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        union(arr1, arr2);
    }

}
