import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author Teagan Donnelly
 */
public class FlashCards {

    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words;

    private FlashCards(){
        this.rand = new Random();
        words = FileReader.getWords();
    }

    public static FlashCards getInstance(){
        if (flashCards == null) {
			flashCards = new FlashCards();
		}
		return flashCards;
    }

    public Word getWord(){
        int index = rand.nextInt(words.size());
        return words.get(index);
    }

}
