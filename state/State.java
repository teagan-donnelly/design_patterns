package state;
import java.util.random.*;

/**
 * 
 * @author Teagan Donnelly
 */
public abstract class State {

    protected VocabularyList vocabularyList;
    protected Hashmap<String, String> words;
    private Random rand;

    public State(VocabularyList vocabularyList){

    }

    public String getNextDefinition(){

    }

    public String getMatchingWord(String definition){

    }

    public void increaseGrade(){

    }

    public void decreaseGrade(){
        
    }
}
