public class TwoSum{
        public static void main(String[] args){
            int arr[] = {1,2,45,56,3,6,3,7,3,5,23,34,8,9,4,1};
            int target = 4;
            System.out.println(twoSum(arr,target));
        }

        public static int[] twoSum(int[] nums, int target) {
            int pairArr[] = new int[2];
            for (int i = 0; i < nums.length - 1; i++){
                for (int j = 1; j < nums.length; j++){
                    if(nums[i] + nums[j] == target && i != j){
                        pairArr[0] = i;
                        pairArr[1] = j;
                    }
                }

            }
            return pairArr;
        }
}
