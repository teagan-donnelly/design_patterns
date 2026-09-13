package state;

/**
 * 
 * @author Teagan Donnelly
 */
public class ThirdGradeState extends State{

    public ThirdGradeState(VocabularyList vocabularyList){
        super(vocabularyList);
    }

    public void increaseGrade(){
        System.out.println("You are unable to increase your grade.");
    }

    public void decreaseGrade(){
        vocabularyList.setState(vocabularyList.getSecondGradeState());
    }
}
