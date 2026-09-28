package iterator;

/**
 * Represents a ticket on a SCRUM board
 * @author Teagan Donnelly
 */
public class Ticket {
    private String name;
    private String teamMember;
    private Difficulty difficulty;

    /**
     * creates a ticket with a name, team member, and difficultly
     * @param name the name of the task
     * @param teamMember the name of the team member the task is assigned to 
     * @param difficulty the diffice taskulty of th
     */
    public Ticket(String name, String teamMember, Difficulty difficulty){
        this.name = name;
        this.teamMember = teamMember;
        this.difficulty = difficulty;
    }

    /**
     * returns the name of the ticket
     * @return the name of the ticket
     */
    public String getName(){
        return name;
    }

    /**    (non-Javadoc)
     * returns a ticket in its correct color and formatted string
     * @see java.lang.Object#toString()
     */
    public String toString(){
        return difficulty.ASCII + name + "(Difficulty:" + difficulty +  ")" +  " - " + teamMember;
    }

}