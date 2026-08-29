/**
 * Written By Teagan Donnelly
 * CSCE 247 002
 */
package designPatterns.strategy;
import java.util.ArrayList;

public class Team {
    //Instance varibles
    private String teamName; 
    private ArrayList<Player> players;

    public Team(String teamName){
        //sets instance varibles
        this.teamName = teamName;
        this.players = new ArrayList<Player>();
    }

    //methods listed in the UML diagram
    public void addTeamMember(String firstName, String lastName, PlayerType playerType){
        //determines what type of player to create and then adds them to the players array
        if (playerType == PlayerType.GOALIE){
            Goalie goalie = new Goalie(firstName, lastName);
            players.add(goalie);
            //players.add(new Goalie(firstname, lastname))
        } else if (playerType == PlayerType.FORWARD){
            Forward forward = new Forward(firstName, lastName);
            players.add(forward);
        } else {
            Defenceman defenceman = new Defenceman(firstName, lastName);
            players.add(defenceman);
        }
    }

    public void executePlay(PlayerType playerType){
        //traverses the players array
        //shouldve used for (Player player : players)
        for(int i = 0; i < players.size(); i++ ){
            Player player = players.get(i);

            /*gets the PlayerType and if it matches the parameter it will
            print out the play() method*/
            if (player.getPlayerType() == playerType){
                System.out.println(player.play());
            }
        }
    }

    //Getters
    public String getName(){
        return teamName;
    }

    public ArrayList<Player> getPlayers(){
        return players;
    }

}
