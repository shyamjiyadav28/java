class Solution {
    public String toGoatLatin(String sentence) {

        String[] words = sentence.split(" ");
        String ans = "";

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            // Check vowel
            if (!(word.charAt(0) == 'a' ||
                  word.charAt(0) == 'e' ||
                  word.charAt(0) == 'i' ||
                  word.charAt(0) == 'o' ||
                  word.charAt(0) == 'u' ||
                  word.charAt(0) == 'A' ||
                  word.charAt(0) == 'E' ||
                  word.charAt(0) == 'I' ||
                  word.charAt(0) == 'O' ||
                  word.charAt(0) == 'U')) {

                word = word.substring(1) + word.charAt(0);
            }

            word = word + "ma";

            // Add 'a' according to index
            for (int j = 0; j <= i; j++) {
                word = word + "a";
            }

            ans = ans + word + " ";
        }

        return ans.trim();
    }
}