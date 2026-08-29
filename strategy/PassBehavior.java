/**
 * Written By Teagan Donnelly
 * CSCE 247 002
 */
package designPatterns.strategy;

public class PassBehavior implements Behavior{

    @Override
    public String play(){
        //creates varibles for the color of the player
        String blue = "\u001B[34m";
        //will turn the text color back to normal
        String reset = "\u001B[0m";
        return "Passes the puck!!!\n"
            + "   o                 o\n"
            + "  -" + blue + "|" + reset + "-\\             /-" + blue + "|" + reset + "-\n"
            + "  " + blue + "/ \\" + reset + " \\_     .   _/ " + blue + "/ \\" + reset + "\n";
    }

}
