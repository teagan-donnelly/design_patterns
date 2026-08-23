/**
 * Written By Teagan Donnelly
 * CSCE 247 002
 */
package strategy;

public class BlockGoalBehavior implements Behavior {

    @Override
    public String play(){
        //creates varibles for the color of the player
        String blue = "\u001B[34m";
        String red = "\u001B[31m";
        //turns the text color back to normal
        String reset = "\u001B[0m";
        return "Blocks the Goal!!!\n"
            + "   o                    o\n"
            + "  -" + red + "|" + reset + "-\\        .       /-" + blue + "|" + reset + "-\n"
            + "  " + red + "/ \\" + reset + " \\_            _/ " + blue + "/ \\" + reset + "\n";
    }
    
}
