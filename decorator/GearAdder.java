package decorator;

import java.util.ArrayList;

/**
 * 
 * @author Teagan Donnelly
 */
public abstract class GearAdder extends Player {
    
    public GearAdder(Player player, ArrayList<String> gear){
        super(player.character, player.getName());
        addGear(gear);
    }

    protected void addGear(ArrayList<String> gear){

        for(int i=0; i < character.size(); i++){

            String characterLine = character.get(i);
            String gearLine = gear.get(i);

            String rowString = "";

            for(int j=0; j < characterLine.length(); j++){
                if (gearLine.charAt(j) == ' '){
                    rowString += characterLine.charAt(j);
                } else {
                    rowString += gearLine.charAt(j);
                }
            }

            character.set(i, rowString);
        }

    }
}
