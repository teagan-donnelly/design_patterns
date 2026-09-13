package state;
import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;


/**
 * Represents a vocabulary game state for a specific grade 
 * @author Teagan Donnelly
 */
public abstract class State {

    protected VocabularyList vocabularyList;
    protected HashMap<String, String> words;
    private Random rand;

    /**
     * creates a state associated with the given vocab list
     * @param vocabularyList the vocabulary list using this state
     */
    public State(VocabularyList vocabularyList){
        this.vocabularyList = vocabularyList;
        this.rand = new Random();
    }

    /**
     * loads the keys from the given file into a new array and 
     * calls a random index to produce a random definition 
     * @return a random definition from the given text file
     */
    public String getNextDefinition(){
        ArrayList<String> definitions = new ArrayList<>(words.keySet());
        int index = rand.nextInt(definitions.size());
        return definitions.get(index);
    }

    /**
     * gets the word that matches the given definiton
     * @param definition the definiton used to find the matching word
     * @return the matching word to the definiton
     */
    public String getMatchingWord(String definition){
        return words.get(definition);
    }

    /**
     * Changes the vocabulary list to a higher grade
     */
    public void increaseGrade(){

    }

    /**
     * Changes the vocabulary list to a higher grade
     */
    public void decreaseGrade(){
        
    }
}
