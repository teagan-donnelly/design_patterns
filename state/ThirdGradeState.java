package state;

/**
 * 
 * @author Teagan Donnelly
 */
public class ThirdGradeState extends State{

    public ThirdGradeState(VocabularyList vocabularyList){
        super(vocabularyList);
        words = FileReader.getWords("state/third.txt");
    }

    @Override 
    public void increaseGrade(){
        System.out.println("You are unable to increase your grade.");
    }

    @Override 
    public void decreaseGrade(){
        vocabularyList.setState(vocabularyList.getSecondGradeState());
    }
}
