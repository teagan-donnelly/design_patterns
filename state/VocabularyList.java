package state;

/**
 * manages the current vocab state and allows the game to 
 * move between different states
 * @author Teagan Donnelly
 */

public class VocabularyList {

    private State state;
    private FirstGradeState firstGradeState;
    private SecondGradeState secondGradeState;
    private ThirdGradeState thirdGradeState;

    /**
     * Creates the vocab list, initializes all the grade, 
     * and starts the game in the first grade state
     */
    public VocabularyList(){
        firstGradeState = new FirstGradeState(this);
        secondGradeState = new SecondGradeState(this);
        thirdGradeState = new ThirdGradeState(this);

        state = firstGradeState;
    }

    /**
     * gets a definition from the current grade state
     * @return a definiton from the currect  state's vocab
     */
    public String getNextDefinition(){
        return state.getNextDefinition();
    }

    /**
     * gets the word that matches the given definition
     * @param definition the definition used to find the matching word
     * @return the matching word to the given definiton
     */
    public String getMatchingWord(String definition){
        return state.getMatchingWord(definition);
    }

    /**
     * tells the current state to increase the grade level
     */
    public void increaseGrade(){
        state.increaseGrade();
    }

    /**
     * tells the current state to decrease the grade level
     */
    public void decreaseGrade(){
        state.decreaseGrade();
    }

    /**
     * gets the first grade state
     * @return the first grade state
     */
    public State getFirstGradeState(){
        return firstGradeState;
    }

    /**
     * gets the second grade state
     * @return the second grade state
     */
    public State getSecondGradeState(){
        return secondGradeState;
    }

    /**
     * gets the third grade state
     * @return the third grade state
     */
    public State getThirdGradeState(){
        return thirdGradeState;
    }

    /**
     * changes the current state of the vocab list
     * @param state the new current state
     */
    public void setState(State state){
        this.state = state;
    }
}
