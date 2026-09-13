package state;

/**
 * Represents the first grade vocabulary state
 * @author Teagan Donnelly
 */
public class FirstGradeState extends State{

    /**
     * creates the first grade state and loads the correct text file
     * @param vocabularyList the vocabulary list the matches the state
     */
    public FirstGradeState(VocabularyList vocabularyList){
        super(vocabularyList);
        words = FileReader.getWords("state/first.txt");
    }

    /**    (non-Javadoc)
     * 
     * @see state.State#increaseGrade()
     */
    @Override 
    public void increaseGrade(){
        vocabularyList.setState(vocabularyList.getSecondGradeState());
        System.out.println("You are now in the Second Grade");
    }

    /**    (non-Javadoc)
     * 
     * @see state.State#decreaseGrade()
     */
    @Override 
    public void decreaseGrade(){
        System.out.println("You are unable to decrease your grade.");
    }
}
