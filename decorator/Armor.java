package decorator;

/**
 * creates armor that can be added to the character
 * @author Teagan Donnelly
 */
public class Armor extends GearAdder{
    /**
     * creates armor and adds it to the given player
     * @param player the player that is getting the armor
     */
    public Armor(Player player){
        super(player, FileReader.getLines("armor.txt"));
    }
}
