package decorator;

import java.util.ArrayList;

/**
 * adds gear to a Player
 * @author Teagan Donnelly
 */
public abstract class GearAdder extends Player {
    
    /**
     * creates a GearAdder with the given player and gear
     * @param player the player that is having gear added to it 
     * @param gear the gear that is being added to the player
     */
    public GearAdder(Player player, ArrayList<String> gear){
        super(player.character, player.getName());
        addGear(gear);
    }

    /**
     * adds gear to the Player
     * @param gear the gear that is being added to the player
     */
    protected void addGear(ArrayList<String> gear){

        for(int i=0; i < character.size(); i++){

            String characterLine = character.get(i);
            String gearLine = gear.get(i);

            int max = 0;
            if(characterLine.length() > gearLine.length()){
                max = characterLine.length();
            } else {
                max = gearLine.length();
            }

            String rowString = "";

            for(int j = 0; j < max; j++){

                if(j >= characterLine.length()){
                    rowString += gearLine.charAt(j);
                } 
                else if(j >= gearLine.length() || gearLine.charAt(j) == ' '){
                    rowString += characterLine.charAt(j);
                } 
                else {
                    rowString += gearLine.charAt(j);
                }
            }

            character.set(i, rowString);
        }

    }
}
