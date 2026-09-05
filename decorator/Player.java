import java.util.ArrayList;

/**
 * 
 * @author Teagan Donnelly
 */
public abstract class Player {
    protected String name;
    protected ArrayList<String> character = new ArrayList<>();

    public Player(ArrayList<String> character, String name){
        this.character = character;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        String characterString = "";

        for(String line : character){
            characterString += line + "\n";
        }

        return characterString;
    }

}
