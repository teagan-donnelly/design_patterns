package state;

/**
 * 
 * @author Teagan Donnelly
 */
public class FirstGradeState extends State{

    public FirstGradeState(VocabularyList vocabularyList){
        super(vocabularyList);
    }

    public void increaseGrade(){
        vocabularyList.setState(vocabularyList.getSecondGradeState());
    }

    public void decreaseGrade(){
        System.out.println("You are unable to decrease your grade.");
    }
}
