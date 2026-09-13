package state;

/**
 * 
 * @author Teagan Donnelly
 */
public class SecondGradeState extends State{

    public SecondGradeState(VocabularyList vocabularyList){
        super(vocabularyList);
    }

    public void increaseGrade(){
        vocabularyList.setState(vocabularyList.getThirdGradeState());
    }

    public void decreaseGrade(){
        vocabularyList.setState(vocabularyList.getFirstGradeState());
    }
}
