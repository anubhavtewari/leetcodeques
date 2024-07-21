package ArraysRecursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,23,4,51,6,7,8};
        System.out.println(find(arr,51,0));
    }
    static boolean find(int[] arr, int target, int index){
        //base condition
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }
}
