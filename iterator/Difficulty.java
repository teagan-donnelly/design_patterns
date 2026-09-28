package iterator;

/**
 * contains possible diffifulty levels and stores a color associated to each
 * @author Teagan Donnelly
 */
public enum Difficulty {
    HARD("\u001B[31m" ),
    MEDIUM("\u001B[32m" ),
    EASY("\u001B[33m");
    public String ASCII;

    /**
     * created a difficulty with its associated color
     * @param ascii the color code for the difficulty
     */
    private Difficulty(String ascii){
        this.ASCII = ascii;
    }
}
