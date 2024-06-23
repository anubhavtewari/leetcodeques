/*
344. Reverse String
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class ReverseString {
//        public void reverseString(char[] s) {
//            for(int i = 0; i < s.length / 2; i++){
//                char ch = s[i];
//                s[i] = s[s.length - 1 - i];
//                s[s.length -1 - i] = ch;
//            }
//        }
//OR
//
//    public void reverseString(char[] s) {
//        int left = 0, right = s.length - 1;
//        while (left < right) {
//            char temp = s[left];
//            s[left] = s[right];
//            s[right] = temp;
//            left++;
//            right--;
//        }
//    }

        //Using recursion
        public void reverseString(char[] s) {
            reverse(s, 0, s.length - 1);
        }

    private void reverse(char[] s, int left, int right) {
        if (left >= right) return;
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        reverse(s, left + 1, right - 1);
    }
}
