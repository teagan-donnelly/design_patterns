package decorator;

/**
 * creates a shield that can be added to the character 
 * @author Teagan Donnelly
 */
public class Shield extends GearAdder{
    /**
     * creates a shield and adds it to the given player
     * @param player the player that is getting the shield
     */
    public Shield(Player player){
        super(player, FileReader.getLines("shield.txt"));
    }
}
