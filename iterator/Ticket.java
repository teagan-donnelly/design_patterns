package iterator;

/**
 * 
 * @author Teagan Donnelly
 */
public class Ticket {
    private String name;
    private String teamMember;
    private Difficulty difficulty;

    public Ticket(String name, String teamMember, Difficulty difficulty){
        this.name = name;
        this.teamMember = teamMember;
        this.difficulty = difficulty;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        
    }

}
