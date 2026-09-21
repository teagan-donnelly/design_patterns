

/**
 * Represents a word on the flashcard
 * @author Teagan Donnelly
 */
public class Word {

    private String word;
    private String type;
    private String definition;
    private String sentance;

    /**
     * Creates a new word with its flash card information 
     * @param word the word assigned to the flashcard 
     * @param type the part of speech that the given word is (verb,noun,etc.)
     * @param definition the definition of the word
     * @param sentace a stentace containing the given word
     */
    public Word(String word, String type, String definition, String sentace){
        this.word = word;
        this.type = type;
        this. definition = definition;
        this.sentance = sentace;
    }

    /**
     * creates the string of the front of the flashcard
     * @return the flashcard with the word on it
     */
    public String getFlashCardFront(){
        String reset = "\u001B[0m";
        String cyan = "\u001B[36m";

        String border = cyan + "+--------------------------------------------------------------+" + reset;
        String blankLine = cyan + "|                                                              |" + reset;
        String wordLine = cyan + "| " + reset + "Word: " + cyan + word.toUpperCase() + " ".repeat(55 - word.length()) + "|" + reset;

        return border + "\n" + wordLine + "\n" + blankLine + "\n" + blankLine + "\n" + blankLine + "\n" + border;
    }

    /**
     * creates a string of the back of the flashcard
     * @return the flashcard with the word, definiton, and sentance on it
     */
    public String getFlashCardBack(){
        String reset = "\u001B[0m";
        String cyan = "\u001B[36m";
        String pink = "\u001B[38;5;213m";

        String border = cyan + "+--------------------------------------------------------------+" + reset;
        String wordLine = cyan + "| " + reset + "Word: " + cyan + word.toUpperCase() + " ".repeat(55 - word.length()) + "|" + reset;
        String typeLine = cyan + "| " + reset + "Part of Speech: " + cyan + type + " ".repeat(45 - type.length()) + "|" + reset;
       
        //wraps the sentance if its longer than the width of the card
        String defLine;
        if (definition.length() <= 49) {
            defLine = cyan + "| " + reset + "Definition: " + pink + definition
                    + " ".repeat(49 - definition.length()) + cyan + "|" + reset;
        } else {
            String firstPart = definition.substring(0, 49);
            String secondPart = definition.substring(49);

            defLine = cyan + "| " + reset + "Definition: " + pink + firstPart + cyan + "|\n"
                    + "|             " + pink + secondPart
                    + " ".repeat(49 - secondPart.length()) + cyan + "|" + reset;
        }

        String sentLine = cyan + "| " + reset + "Sentence: " + pink;

        int maxLength = 51;
        int start = 0;

        while (start < sentance.length()) {
            int end = Math.min(start + maxLength, sentance.length());
            String part = sentance.substring(start, end);

            if (start != 0) {
                sentLine += cyan + "|           " + pink;
            }

            sentLine += part + " ".repeat(maxLength - part.length()) + cyan + "|\n";

            start = end;
        }

        return border + "\n" + wordLine + "\n" + typeLine + "\n" + defLine + "\n" + sentLine + "\n" + border;
    }
}
