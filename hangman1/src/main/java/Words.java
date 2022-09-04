import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Words {
    public String[] wordsList;

    public Words(String[] wordsList) {
        this.wordsList = wordsList;
    }

    public String getRandomWord() {
        int max = wordsList.length;
        int min = 0;
        int range = max - min;
        int randomIndex = (int) (Math.random() * range) + min;
        return wordsList[randomIndex];
    }

    public List<Character> changeRandomWordToList(String randomWord) {
        List<Character> characters = new ArrayList<>();
        for (char ch : randomWord.toCharArray()) {
            characters.add(ch);
        }
        return characters;
    }

    public List<Character> generateBlankList(String randomWord) {
        List<Character> blankList = new ArrayList<>();
        for (char ch : randomWord.toCharArray()) {
            blankList.add('_');
        }
        return blankList;
    }

    public String generateStringForGuessingWord(List<Character> blankList) {
        String res = blankList.stream()
                .map(i -> String.valueOf(i))
                .collect(Collectors.joining(" "));

        return res;
    }


}

