public class MaxConsecutiveOnes485LC {
        public int findMaxConsecutiveOnes(int[] nums) {
            int c = 0, max = 0;
            for(int i: nums){
                if(i == 1){
                    c++;
                }
                else{
                    c = 0;
                }
                if(max < c){
                    max = c;
                }
            }
            return max;
        }
}
