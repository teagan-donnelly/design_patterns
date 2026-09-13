package state;
import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;


/**
 * 
 * @author Teagan Donnelly
 */
public abstract class State {

    protected VocabularyList vocabularyList;
    protected HashMap<String, String> words;
    private Random rand;

    public State(VocabularyList vocabularyList){
        this.vocabularyList = vocabularyList;
        this.rand = new Random();
    }

    public String getNextDefinition(){
        ArrayList<String> definitions = new ArrayList<>(words.keySet());
        int index = rand.nextInt(definitions.size());
        return definitions.get(index);
    }

    public String getMatchingWord(String definition){
        return words.get(definition);
    }

    public void increaseGrade(){

    }

    public void decreaseGrade(){
        
    }
}
