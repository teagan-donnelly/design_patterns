package iterator;

/**
 * represents a SCRUM board containing todo, doing, and done task lists
 * @author Teagan Donnelly
 */
public class SCRUMBoard {
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;

    /**
     * creates a SCRUM board with the given name
     * @param projectName the name of the board
     */
    public SCRUMBoard(String projectName){
        this.projectName = projectName;

        todo = new TaskList("TODO");
        doing = new TaskList("DOING");
        done = new TaskList("DONE");
    }

    /**
     * adds a new ticket to thye todo list
     * @param name the name of the task on the ticket
     * @param teamMember the name of the person the ticket is assigned to
     * @param difficulty the difficulty of the ticket
     */
    public void addTicket(String name, String teamMember, Difficulty difficulty){
        todo.addTicket(name, teamMember, difficulty);
    }

    /**
     * moves a ticket from the todo list to the doing list
     * @param name the name of the task of the ticket
     * @return true if the item is found, otherwise faluse
     */
    public boolean startTicket(String name){
        Ticket ticket = todo.getTicket(name);

        if (ticket == null){
            return false;
        }

        doing.addTicket(ticket);
        return true;
    
    }

    /**
     * moves a ticket from the doing list to the done list
     * @param name the name of the ticket to finish
     * @return true if the ticket was found, false otherwise
     */
    public boolean finishTicket(String name){
        Ticket ticket = doing.getTicket(name);

        if (ticket == null){
            return false;
        }

        done.addTicket(ticket);
        return true;
    }

    /**    (non-Javadoc)
     * returns the SCRUM board in a formatted string
     * @see java.lang.Object#toString()
     */
    public String toString(){
        return "\u001B[0m" + "*****" + projectName + "*****" + "\n" + "\n" + todo.toString() + "\n" + doing.toString() + "\n" + done.toString() ;
    }
}
