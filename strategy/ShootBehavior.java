/**
 * Written By Teagan Donnelly
 * CSCE 247 002
 */
package strategy;

public class ShootBehavior implements Behavior {

    @Override
    public String play(){
        //creates varibles for the color of the player
        String blue = "\u001B[34m";
        //will turn the text color back to normal
        String reset = "\u001B[0m";
        return "Shoots at the Goal!!!\n"
            + "   o                         |\\\n"
            + "  -" + blue + "|" + reset + "-\\                       | \\\n"
            + "  " + blue + "/ \\" + reset + " \\_       .             |  \\\n"
            + "                             \n";
    }

}
