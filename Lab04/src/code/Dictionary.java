import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Dictionary class that stores and provides operations on words starting with "ja".
 * This class provides methods to retrieve words starting with "ja" and perform
 * various operations such as reversing a string, comparing alphabetical order, and
 * checking the length of a word.
 *
 * Usage example:
 * <pre>
 * {@code
 *  Dictionary dictionary = new Dictionary();
 *  List<String> jaWords = dictionary.getWordsStartWithJa();
 *  String reversedWord = Dictionary.reverseString("java"); // returns "avaj"
 * }
 * </pre>
 *
 * @author Marius Guerra, Andres Arevalo && Hamrazz
 */
public class Dictionary
{
    private final List<String> wordsStartWithJa;
    private final String[] jaWords;

    Dictionary()
    {


        jaWords = new String[] {
                "jab", "jabbed", "jabber", "jabbered", "jabbering", "jabbers", "jabberwocky", "jabbing", "jabot", "jabots",
                "jabs", "jacaranda", "jacarandas", "jacinth", "jack", "jackal", "jackals", "jackanapes", "jackanapeses",
                "jackass", "jackasses", "jackboot", "jackboots", "jackdaw", "jackdaws", "jacked", "jacket", "jacketed",
                "jacketing", "jackets", "jackhammer", "jackhammers", "jackie", "jacking", "jackknife", "jackpot",
                "jackpots", "jacks", "jackson", "jacksonville", "jaclyn", "jacob", "jacobean", "jacobian", "jacobin",
                "jacobins", "jacobite", "jacobites", "jacobs", "jacquard", "jacquards", "jacqueline", "jacques",
                "jactitation", "jactitations", "jactus", "jacuzzi", "jacuzzis", "jade", "jaded", "jadeite", "jadeites",
                "jades", "jading", "jaeger", "jaffa", "jag", "jagged", "jaggedly", "jaggedness", "jagger", "jags",
                "jaguar", "jaguars", "jai", "jail", "jailed", "jailer", "jailers", "jailhouse", "jailing", "jailor",
                "jailors", "jails", "jaipur", "jakarta", "jake", "jalopies", "jalopy", "jalousie", "jalousies", "jam",
                "jamaica", "jamaican", "jamaicans", "jamb", "jamboree", "jamborees", "jambs", "james", "jamey", "jamie",
                "jammed", "jamming", "jammy", "jams", "jan", "jane", "janeiro", "janet", "jangle", "jangled", "jangles",
                "jangling", "janice", "janitor", "janitorial", "janitors", "january", "januarys", "janus", "japan",
                "japanese", "japanned", "japanning", "japans", "jape", "japed", "japer", "japers", "japery", "japes",
                "japing", "japonica", "japonicas", "jar", "jardiniere", "jardinieres", "jarful", "jarfuls", "jargon",
                "jargons", "jarred", "jarring", "jarringly", "jarrow", "jars", "jasmine", "jasmines", "jason", "jasper",
                "jaspers", "jaundice", "jaundiced", "jaunt", "jaunted", "jauntier", "jauntiest", "jauntily", "jaunting",
                "jaunts", "jaunty", "java", "javanese", "javelin", "javelins", "jaw", "jawbone", "jawbones", "jawboning",
                "jawbreaker", "jawbreakers", "jawed", "jawing", "jaws", "jay", "jays", "jayvees", "jaywalk", "jaywalked",
                "jaywalker", "jaywalkers", "jaywalking", "jaywalks", "jazz", "jazzed", "jazzes", "jazzier", "jazziest",
                "jazzing", "jazzman", "jazzmen", "jazzy"
        };


        wordsStartWithJa = new ArrayList<>(Arrays.asList(jaWords));

    }

    /**
     * Creates a string based on the provided word and number using a Wordable function.
     *
     * @param word the input word
     * @param number the integer parameter for the Wordable function
     * @param w the Wordable function
     * @return the resultant string after applying the Wordable function
     */
    public String getWords(final String word, final int number, final Wordable w)
    {
      return null;
    }


    /**
     * Returns the list of words that start with "ja".
     *
     * @return list of words starting with "ja"
     */
    public List<String> getWordsStartWithJa()
    {
        return wordsStartWithJa;
    }

    /**
     * Returns the array of words that start with "ja".
     *
     * @return array of words starting with "ja"
     */
    public String[] getJaWords()
    {
        return jaWords;
    }

    /**
     * Reverses the input string.
     *
     * @param s the input string
     * @return the reversed string
     */
    public static String reverseString(final String s)
    {
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * Compares two words in alphabetical order.
     *
     * @param word1 the first word
     * @param word2 the second word
     * @return a negative integer, zero, or a positive integer as the first word is less than,
     *         equal to, or greater than the second word
     */
    public static int alphabeticalOrder(final String word1, final String word2)
    {
        return word1.compareTo(word2);
    }

    /**
     * Checks if the length of the input word is above five.
     *
     * @param word the input word
     * @return true if the word length is above five, otherwise false
     */
    public static boolean isLengthAboveFive(final String word)
    {
        return word.length() > 5;
    }

}
