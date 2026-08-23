/**
 * Written By Teagan Donnelly
 * CSCE 247 002
 */
package strategy;

public class Defenceman extends Player{

    public Defenceman(String firstName, String lastName){
       //calls the parent class to establish it's attributes 
       super(firstName, lastName, PlayerType.DEFENCE_MAN);
    }

    @Override
    public void setBehavior(){
        //randomly chooses behavior
        if (rand.nextBoolean()) {
            behavior = new BlockBehavior();
        } else {
            behavior = new PassBehavior();
        }
    }
}
