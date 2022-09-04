import java.util.List;

public class WordToGuessingModel {
    public String randomWord;
    public List<Character> userAnswersList;
    public List<Character> randomWordToList;
    public Character currentLetterFromUser;

    public WordToGuessingModel() {
    }

    public String getRandomWord() {
        return randomWord;
    }

    public void setRandomWord(String randomWord) {
        this.randomWord = randomWord;
    }

    public List<Character> getUserAnswersList() {
        return userAnswersList;
    }

    public void setUserAnswersList(List<Character> userAnswersList) {
        this.userAnswersList = userAnswersList;
    }

    public List<Character> getRandomWordToList() {
        return randomWordToList;
    }

    public void setRandomWordToList(List<Character> randomWordToList) {
        this.randomWordToList = randomWordToList;
    }

    public Character getCurrentLetterFromUser() {
        return currentLetterFromUser;
    }

    public void setCurrentLetterFromUser(Character currentLetterFromUser) {
        this.currentLetterFromUser = currentLetterFromUser;
    }
}
