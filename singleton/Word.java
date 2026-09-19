

/**
 * 
 * @author Teagan Donnelly
 */
public class Word {

    private String word;
    private String type;
    private String definition;
    private String sentance;

    public Word(String word, String type, String definition, String sentace){
        this.word = word;
        this.type = type;
        this. definition = definition;
        this.sentance = sentace;
    }

    public String getFlashCardFront(){
        String reset = "\u001B[0m";
        String cyan = "\u001B[36m";

        String border = cyan + "+--------------------------------------------------------------+" + reset;
        String blankLine = cyan + "|                                                              |" + reset;
        String wordLine = cyan + "| " + reset + "Word: " + cyan + word.toUpperCase() + " ".repeat(55 - word.length()) + "|" + reset;

        return border + "\n" + wordLine + "\n" + blankLine + "\n" + blankLine + "\n" + blankLine + "\n" + border;
    }

    public String getFlashCardBack(){
        String reset = "\u001B[0m";
        String cyan = "\u001B[36m";
        String pink = "\u001B[38;5;213m";

        String border = cyan + "+--------------------------------------------------------------+" + reset;
        String wordLine = cyan + "| " + reset + "Word: " + cyan + word.toUpperCase() + " ".repeat(55 - word.length()) + "|" + reset;
        String typeLine = cyan + "| " + reset + "Part of Speech: " + cyan + type + " ".repeat(45 - type.length()) + "|" + reset;
        String defLine = cyan + "| " + reset + "Definition: " + pink + definition + " ".repeat(49 - definition.length()) + cyan + "|" + reset;
        String sentLine = cyan + "| " + reset + "Sentence: " + pink + sentance + " ".repeat(51 - sentance.length()) + cyan + "|" + reset;

        return border + "\n" + wordLine + "\n" + typeLine + "\n" + defLine + "\n" + sentLine + "\n" + border;
    }
}
