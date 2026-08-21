package strategy;
import java.util.ArrayList;

public class Team {
    //Instance varibles
    private String teamName; 
    private ArrayList<Player> players;

    public Team(String teamName, ArrayList<Player> players){
        //sets instance varibles
        this.teamName = teamName;
        this.players = players;
    }

    //methods listed in the UML diagram
    public void addTeamMember(String firstName, String lastName, PlayerType playerType){
        //TODO
    }

    public void executePlay(PlayerType playerType){
        //TODO
    }

    //Getters
    public String getName(){
        return teamName;
    }

    public ArrayList<Player> getPlayers(){
        return players;
    }

}
