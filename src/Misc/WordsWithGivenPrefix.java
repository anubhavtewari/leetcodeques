public class WordsWithGivenPrefix {
    public int prefixCount(String[] words, String pref) {
            int len = pref.length(), count = 0;
            for(int i = 0; i < words.length; i++){
                if(words[i].toLowerCase().startsWith(pref.toLowerCase())){
                    count++;
                }
            }
            return count;
    }
}
