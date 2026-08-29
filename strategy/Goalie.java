/**
 * Written By Teagan Donnelly
 * CSCE 247 002
 */
package designPatterns.strategy;

public class Goalie extends Player {

    public Goalie(String firstName, String lastName){
       super(firstName, lastName, PlayerType.GOALIE);
    }

    @Override
    public void setBehavior(){
        //randomly chooses which action the player will perform 
        if (rand.nextBoolean()) {
            behavior = new BlockGoalBehavior();
        } else {
            behavior = new PassBehavior();
        } 
    }
}
