package strategy;

import java.util.Random;

public abstract class Player {
    
    //initializes instance varibles
    private String firstName;
    private String lastName;
    protected Behavior behavior;
    protected Random rand;
    protected PlayerType playerType; 

    public Player(String firstName, String lastName, PlayerType playerType){
        //sets instance varibles
        this.firstName = firstName;
        this.lastName = lastName;
        this.rand = new Random();
        this.playerType = playerType;
    }

    public abstract void setBehavior();

    public String play(){
        setBehavior();
        return behavior.play();
    }

    public String toString(){
        return firstName + " " + lastName + " " + playerType;
    }

    public PlayerType getPlayerType(){
        return playerType;
    }
}
