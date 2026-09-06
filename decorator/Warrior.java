package decorator;

/**
 * represents a warrior player
 * @author Teagan Donnelly
 */
public class Warrior extends Player {
    /**
     * creates a new warrior with the given name and loads the ASCII text file
     * into an ArrayList
     * @param name the name of the Player
     */
    public Warrior(String name){
        super(FileReader.getLines("decorator/warrior.txt"), name);
    }
}
