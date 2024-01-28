public class InterviewStringsClass {
    
    //Reverse String
    public static String reverse(String String) {

        String reversedString = "";
        String character = "";

        for (int i = 0; i <= String.length(); i++) {

            if (i == 0)
                character = String.substring(String.length() - i, String.length());
            else
                character = String.substring(String.length() - i, String.length() - i + 1);

            reversedString = reversedString + character;
        }
        return reversedString;
    }
    
    //Print number of characters, digits, spaces, symbols in a sentence
    public static void printSentenceCharacteristics(String Sentence) {

        String currentCharacter = "";
        int numberCount = 0;
        int characterCount = 0;
        int whiteSpacesCount = 0;
        int otherSymbolsCount = 0;


        for (int i = 0; i < Sentence.length(); i++) {

            currentCharacter = Sentence.substring(i, i + 1);

            if (currentCharacter.matches(" "))
                whiteSpacesCount = whiteSpacesCount + 1;
            if (currentCharacter.matches("[0-9+]"))
                numberCount = numberCount + 1;
            if (currentCharacter.matches("[a-zA-Z]+"))
                characterCount = characterCount + 1;
            if (!currentCharacter.matches(" ") && !currentCharacter.matches("[0-9+]") && !currentCharacter.matches("[a-zA-Z+]"))
                otherSymbolsCount = otherSymbolsCount + 1;    
        }

        System.out.println("Number of spaces: " + whiteSpacesCount);
        System.out.println("Number of characters: " + characterCount);
        System.out.println("Number of digits: " + numberCount);
        System.out.println("Number of other symbols: " + otherSymbolsCount);
    }

}
