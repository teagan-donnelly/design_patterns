package strategy;
import java.util.ArrayList;

public class Team {
    //Instance varibles
    private String teamName; 
    private ArrayList<Player> players;

    public Team(String teamName){
        //sets instance varibles
        this.teamName = teamName;
    }

    //methods listed in the UML diagram
    public void addTeamMember(String firstName, String lastName, PlayerType playerType){
        if (playerType == PlayerType.GOALIE){
            Goalie goalie = new Goalie(firstName, lastName);
            players.add(goalie);
        } else if (playerType == PlayerType.FORWARD){
            Forward forward = new Forward(firstName, lastName);
            players.add(forward);
        } else {
            Defenceman defenceman = new Defenceman(firstName, lastName);
            players.add(defenceman);
        }
    }

    public void executePlay(PlayerType playerType){
        for(int i = 0; i < players.size(); i++ ){
            Player player = players.get(i);

            if (player.getPlayerType() == playerType){
                player.play();
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
