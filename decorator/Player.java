package decorator;

import java.util.ArrayList;

/**
 * creates a Player with the given parameters
 * @author Teagan Donnelly
 */
public abstract class Player {
    protected String name;
    protected ArrayList<String> character = new ArrayList<>();

    /**
     * creates a new Player with the given parameters
     * @param character the ArrayList containing all the Strings
     * of the player
     * @param name the name of the player
     */
    public Player(ArrayList<String> character, String name){
        this.character = character;
        this.name = name;
    }

    /**
     * gets the name of the player
     * @return the name of the player
     */
    public String getName(){
        return name;
    }

    /**
     * loops through the character ArrayList and saves each line
     * to a new string varible with line breaks in between
     * @return the full string of the character
     */
    public String toString(){
        String characterString = "";

        for(String line : character){
            characterString += line + "\n";
        }

        return characterString;
    }

}
