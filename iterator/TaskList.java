package iterator;

/**
 * 
 * @author Teagan Donnelly
 */
public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name;

    public TaskList(String name){
        this.name = name;
        tickets = new Ticket[100]; 
    }

    public void addTicket(String name, String teamMember, Difficulty difficulty){
        Ticket ticket = new Ticket(name, teamMember, difficulty);
        addTicket(ticket);
    }

    public void addTicket(Ticket ticket){
        tickets[count] = ticket;
        count++;
    }

    public Ticket getTicket(String name){
        for(Ticket ticket : tickets){
            if(ticket != null && ticket.getName().equals(name)){
                return ticket;
            }
        }
        return null;
    }

    public TaskListIterator createIterator() {
		return new TaskListIterator(tickets);
	}

    public String toString(){
        String result = name + ":\n";

        for (Ticket ticket : tickets){
            if(ticket != null){
                result += ticket.toString() + "\n";
            }
        }
        return result;
    }
}
