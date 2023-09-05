import java.util.List;

public class Scramble {
    public static String scrambleWord(String toBeScrambled) {
        String scrambledEggs = "";
        if (toBeScrambled.length() < 2) {
            return toBeScrambled;
        }
        for(int i = 0; i < toBeScrambled.length()-1;i++) {
            if (toBeScrambled.charAt(i) == 'A' && toBeScrambled.charAt(i+1) != 'A') {
                scrambledEggs += toBeScrambled.charAt(i+1);
                scrambledEggs += toBeScrambled.charAt(i);
                i++;

            } else {
                scrambledEggs += toBeScrambled.charAt(i);
            }
            if (i == toBeScrambled.length()-2) {
                scrambledEggs += toBeScrambled.charAt(i+1);
            }

        }
        return scrambledEggs;
    }
    public static List<String> scrambleOrRemove(List<String> wordList) {
        for (int i = 0; i < wordList.size();i++) {
            if (!scrambleWord(wordList.get(i)).equals(wordList.get(i))) {
                wordList.set(i,scrambleWord(wordList.get(i)));
            } else {
                wordList.remove(i);
                i--;
            }
        }
        return wordList;
    }

}