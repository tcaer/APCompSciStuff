public class HangmanGame {

    private String word;
    private StringBuffer guessed;
    private StringBuffer tried;

    public HangmanGame(String word) {
        this.word = word;

        String blank = "";

        for (int i = 0; i < word.length(); i++) {
            blank += "-";
        }
        guessed = new StringBuffer(blank);
        tried = new StringBuffer();
    }

    public String getWord() {
        return word;
    }

    public String getGuessed() {
        return guessed.toString();
    }

    public String getTried() {
        return guessed.toString();
    }

    public int tryLetter(char letter) {
        String triedString = tried.toString();
        boolean foundLetter = false;
        for (int i = 0; i < triedString.length(); i++) {
            if (triedString.charAt(i) == letter) {
                return 0;
            }
        }
        tried.append(letter);

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                guessed.replace(i, i + 1, Character.toString(letter));
                foundLetter = true;
            }
        }

        if (foundLetter) {
            return 1;
        }

        return -1;
    }

}
