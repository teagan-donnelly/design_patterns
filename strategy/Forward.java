/**
 * Written By Teagan Donnelly
 * CSCE 247 002
 */
package designPatterns.strategy;

public class Forward extends Player {

    public Forward(String firstName, String lastName){
        //calls parent class
       super(firstName, lastName, PlayerType.FORWARD);
    }

    @Override
    public void setBehavior(){
        //randomly chooses if the forward passes or shoots the puck
        if (rand.nextBoolean()) {
            behavior = new ShootBehavior();
        } else {
            behavior = new PassBehavior();
        }
    }
}
