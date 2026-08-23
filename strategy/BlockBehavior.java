/**
 * Written By Teagan Donnelly
 * CSCE 247 002
 */
package strategy;

//initializes child class of Behavior
public class BlockBehavior implements Behavior{

    @Override
    public String play(){
        //creates varibles for the color of the player
        String blue = "\u001B[34m";
        String red = "\u001B[31m";
        //will turn the text color back to normal
        String reset = "\u001B[0m";
        return "Blocks his opponent!!!\n"
            + "          o          o\n"
            + "        /-" + blue + "|" + reset + "-       /-" + red + "|" + reset + "-\n"
            + "  .   _/ " + blue + "/ \\" + reset + "     _/ " + red + "/ \\" + reset + "\n";
    }

}
