import java.util.Scanner;

public class Game {

    public static String[] data = {"wakacje", "praca", "odpoczynek", "gotowanie"};
    public static Words words;
    public static WordToGuessingModel wordToGuessing;
    public static Hang hang;
    public static int failsNumber;

    public Game() {
        words = new Words(data);
        wordToGuessing = new WordToGuessingModel();
        hang = new Hang();
        failsNumber = 0;
    }

    public static void startGame(){
        wordToGuessing.setRandomWord(words.getRandomWord());
        wordToGuessing.setUserAnswersList(words.generateBlankList(wordToGuessing.getRandomWord()));
        wordToGuessing.setRandomWordToList(words.changeRandomWordToList(wordToGuessing.getRandomWord()));

    }

    public static void gameTour(){
        wordToGuessing.setCurrentLetterFromUser(getLetterFromUser());
        if (isCharInWord()) {
            for (int i=0; i<wordToGuessing.getRandomWordToList().size(); i++) {
                if(wordToGuessing.getRandomWordToList().get(i) == wordToGuessing.getCurrentLetterFromUser()) {
                    wordToGuessing.getUserAnswersList().set(i, wordToGuessing.getCurrentLetterFromUser());
                }
            }
        } else {
            failsNumber += 1;
        }
    }

    public static void showGameTour() {
        System.out.println("");
        System.out.println("Guess or hang");
        System.out.println("");
        System.out.println(hang.h1);
        System.out.println("");
        System.out.println("Secret word: " + words.generateStringForGuessingWord(wordToGuessing.getUserAnswersList()));
    }

    public static boolean isCharInWord(){
        return wordToGuessing.getRandomWordToList().contains(wordToGuessing.currentLetterFromUser);
    }

    public static Character getLetterFromUser() {
        Scanner getChar = new Scanner(System.in);
        String letterFromUser = getChar.nextLine();
        return letterFromUser.charAt(0);
    }

    public static void main(String[] args) {
        startGame();
        gameTour();
    }
}
