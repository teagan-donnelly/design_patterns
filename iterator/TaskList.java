package iterator;

/**
 * creates and adds a new ticket to the task list
 * @author Teagan Donnelly
 */
public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name;

    /**
     * creates a task list with the specified name
     * @param name the name of the task list
     */
    public TaskList(String name){
        this.name = name;
        tickets = new Ticket[100]; 
    }

    /**
     * creates a new ticket object and adds it to the list of tickets
     * @param name the name of the task 
     * @param teamMember the team member the task is assigned to 
     * @param difficulty the difficulty of the task
     */
    public void addTicket(String name, String teamMember, Difficulty difficulty){
        Ticket ticket = new Ticket(name, teamMember, difficulty);
        addTicket(ticket);
    }

    /**
     * adds an exisiting ticket to the task list
     * @param ticket the ticket thats being added
     */
    public void addTicket(Ticket ticket){
        tickets[count] = ticket;
        count++;
    }

    /**
     * find and returns a ticket with the specified name
     * @param name the name of the task on the ticket
     * @return the ticket that matches the given name
     */
    public Ticket getTicket(String name){
        for(Ticket ticket : tickets){
            if(ticket != null && ticket.getName().equals(name)){
                return ticket;
            }
        }
        return null;
    }

    /**
     * creates an iterator for traversing the tickets in the task list
     * @return
     */
    public TaskListIterator createIterator() {
		return new TaskListIterator(tickets);
	}

    /**    (non-Javadoc)
     * returns the task list as a fomatted string
     * @see java.lang.Object#toString()
     */
    public String toString(){
        String reset = "\u001B[0m";
        String result = reset + name + ":\n";

        for (Ticket ticket : tickets){
            if(ticket != null){
                result += reset + "- " + ticket.toString() + "\n";
            }
        }
        return result;
    }
}
