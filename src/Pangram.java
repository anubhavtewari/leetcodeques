/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

Example 2:
Input: sentence = "leetcode"
Output: false
 */
import java.util.HashSet;
public class Pangram {
        public boolean checkIfPangram(String sentence) {

            HashSet<Character> hs = new HashSet<>();
            int len = sentence.length();
            for (int i = 0; i < len; i++) {
                hs.add(sentence.charAt(i));
            }
            if (hs.size() == 26)
                return true;

            return false;
        }
}
