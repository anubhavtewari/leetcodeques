// Given an integer array of size n, find all elements that appear more than n/3 times
import java.util.*;
public class MajorityElement {
    // 1. create Map with key=no., value = freq of every no.
    // 2. find freq of all no. and store in map
    // 3. map traverse and check for freq > n/3

    public static void majorityElement(int nums[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) { // true
                map.put(nums[i], map.get(nums[i]) + 1);
            } else { //false
                map.put(nums[i], 1);
            }
            }
            for(int key : map.keySet()){
                if(map.get(key) > n/3){
                    System.out.println(key);
                }
            }
        }
    public static void main (String args[]) {
        int nums[] = {1,3,2,5,1,3,1,5,1};
        majorityElement(nums);
    }
}
