package state;

/**
 * 
 * @author Teagan Donnelly
 */
public class FirstGradeState extends State{

    public FirstGradeState(VocabularyList vocabularyList){
        super(vocabularyList);
        words = FileReader.getWords("state/first.txt");
    }

    @Override 
    public void increaseGrade(){
        vocabularyList.setState(vocabularyList.getSecondGradeState());
    }

    @Override 
    public void decreaseGrade(){
        System.out.println("You are unable to decrease your grade.");
    }
}
