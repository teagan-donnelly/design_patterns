package state;

/**
 * Represnts the third grade state
 * @author Teagan Donnelly
 */
public class ThirdGradeState extends State{

    /**
     * creates the third grade state and loads the correct text file
     * @param vocabularyList the vocabulary list the matches the state
     */
    public ThirdGradeState(VocabularyList vocabularyList){
        super(vocabularyList);
        words = FileReader.getWords("state/third.txt");
    }

    /**    (non-Javadoc)
     * 
     * @see state.State#increaseGrade()
     */
    @Override 
    public void increaseGrade(){
        System.out.println("You are unable to increase your grade.");
    }

    /**    (non-Javadoc)
     * 
     * @see state.State#decreaseGrade()
     */
    @Override 
    public void decreaseGrade(){
        vocabularyList.setState(vocabularyList.getSecondGradeState());
    }
}
