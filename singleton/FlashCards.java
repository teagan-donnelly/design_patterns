

import java.util.ArrayList;
import java.util.Random;

/**
 * manages a single instance of a flashcard
 * @author Teagan Donnelly
 */
public class FlashCards {

    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words;

    /**
     * creates the FlashCards instance and loads the words from the file
     */
    private FlashCards(){
        this.rand = new Random();
        words = FileReader.getWords();
    }

    /**
     * returns a single instance of FlashCards
     * @return an instance of Flashcards if it there is not already one
     */
    public static FlashCards getInstance(){
        if (flashCards == null) {
			flashCards = new FlashCards();
		}
		return flashCards;
    }

    /**
     * selects and returns a random word from the flash cards
     * @return a random word
     */
    public Word getWord(){
        int index = rand.nextInt(words.size());
        return words.get(index);
    }

}
