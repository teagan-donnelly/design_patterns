package state;


/**
 * Represents the second grade state
 * @author Teagan Donnelly
 */
public class SecondGradeState extends State{

    /**
     * creates the second grade state and loads the correct text file
     * @param vocabularyList the vocabulary list the matches the state
     */
    public SecondGradeState(VocabularyList vocabularyList){
        super(vocabularyList);
        words = FileReader.getWords("state/second.txt");
    }

    /**    (non-Javadoc)
     * 
     * @see state.State#increaseGrade()
     */
    @Override 
    public void increaseGrade(){
        vocabularyList.setState(vocabularyList.getThirdGradeState());
        System.out.println("You are now in the Third Grade");
    }

    /**   (non-Javadoc)
     * 
     * @see state.State#decreaseGrade()
     */
    @Override 
    public void decreaseGrade(){
        vocabularyList.setState(vocabularyList.getFirstGradeState());
        System.out.println("You are now in the First Grade");
    }
}
