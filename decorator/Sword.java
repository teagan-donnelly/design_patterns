package decorator;

/**
 * 
 * @author Teagan Donnelly
 */
public class Sword extends GearAdder {

    Player player; 

    public Sword(Player player){
        this.player = player;
    }
}
