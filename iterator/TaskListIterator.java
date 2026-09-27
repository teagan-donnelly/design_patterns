package iterator;
import java.util.Iterator;

/**
 * 
 * @author Teagan Donnelly
 */
public class TaskListIterator implements Iterator<Ticket>{

    private Ticket[] tickets;
    private int position;

    public TaskListIterator(Ticket[] tickets){
        this.tickets = tickets;
    }

    public boolean hasNext(){
        if(position >= tickets.length || tickets[position] == null) {
			return false;
		} else {
			return true;
		}
    }

    public Ticket next(){
        Ticket ticket = tickets[position];
		position = position + 1;
		return ticket;
    }

}
