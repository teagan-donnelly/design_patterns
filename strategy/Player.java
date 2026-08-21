package strategy;

import java.util.ArrayList;
import java.util.Random;

public abstract class Player extends Team {
    
    //initializes instance varibles
    private String firstName;
    private String lastName;
    protected Behavior behavior;
    protected Random rand;
    protected PlayerType playerType; 

    public Player(String teamName, ArrayList<Player> players, String firstName, String lastName, PlayerType playerType){
        super(teamName, players); //calls parent class
        //sets instance varibles
        this.firstName = firstName;
        this.lastName = lastName; 
        this.behavior = behavior;
        this.rand = rand;
        this.playerType = playerType;
    }

    public abstract void setBehavior();

    public String play(){
        //TODO
    }

    public String toString(){
        //TODO
    }

    public PlayerType getPlayerType(){
        return playerType;
    }
}
