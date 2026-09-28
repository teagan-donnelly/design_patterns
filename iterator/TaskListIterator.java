package iterator;
import java.util.Iterator;

/**
 * iterates through the tickets contained in a TaskList
 * @author Teagan Donnelly
 */
public class TaskListIterator implements Iterator<Ticket>{

    private Ticket[] tickets;
    private int position;

    /**
     * creates an iterator for the given array of tickets
     * @param tickets the list of all ticket
     */
    public TaskListIterator(Ticket[] tickets){
        this.tickets = tickets;
    }

    /**
     * determines if there is another ticket in task list
     * @return true or false if there is another ticket in the list
     */
    public boolean hasNext(){
        if(position >= tickets.length || tickets[position] == null) {
			return false;
		} else {
			return true;
		}
    }

    /**    (non-Javadoc)
     * returns the next ticket and advances the iterator
     * @see java.util.Iterator#next()
     */
    public Ticket next(){
        Ticket ticket = tickets[position];
		position = position + 1;
		return ticket;
    }

}
