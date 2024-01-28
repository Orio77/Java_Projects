package Easy;

public class WordCount {
    
    public static int countWords(String sentence) {
        String sentenceSubString;
        int wordCount = 0;
        
        for (int i = 0, j = 1; i < sentence.length(); i++, j++) {
            sentenceSubString = sentence.substring(i, j);
            if (sentenceSubString.matches(" ")) {
                wordCount = wordCount + 1;
            }
        }

        return wordCount + 1;
    }
}
