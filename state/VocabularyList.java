package state;

/**
 * 
 * @author Teagan Donnelly
 */

public class VocabularyList {

    private State state;
    private FirstGradeState firstGradeState;
    private SecondGradeState secondGradeState;
    private ThirdGradeState thirdGradeState;

    public VocabularyList(){
        firstGradeState = new FirstGradeState(this);
        secondGradeState = new SecondGradeState(this);
        thirdGradeState = new ThirdGradeState(this);

        state = firstGradeState;
    }

    public String getNextDefinition(){
        state.getNextDefinition();
    }

    public String getMatchingWord(){
        state.getMatchingWord();
    }

    public void increaseGrade(){
        state.increaseGrade();
    }

    public void decreaseGrade(){
        state.decreaseGrade();
    }

    public State getFirstGradeState(){
        return firstGradeState;
    }

    public State getSecondGradeState(){
        return secondGradeState;
    }

    public State getThirdGradeState(){
        return thirdGradeState;
    }

    public void setState(State state){
        this.state = state;
    }
}
