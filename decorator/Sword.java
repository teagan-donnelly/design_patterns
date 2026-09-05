package decorator;

/**
 * creates a sword that can be added to the characte
 * @author Teagan Donnelly
 */
public class Sword extends GearAdder {
    /**
     * creates a sword and adds it to the given player
     * @param player the player that sword is being added to
     */
    public Sword(Player player){
        super(player, FileReader.getLines("sword.txt"));
    }
}
