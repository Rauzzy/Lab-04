import java.util.Arrays;
import java.util.List;
/**
 * Main class to demonstrate the usage of the Dictionary class and the Wordable functional interface.
 * This class showcases various string operations such as concatenation, repetition, selection of
 * the nth element, and reversing strings from a predefined list of words starting with "ja".
 *
 * Usage:
 * <pre>
 * {@code
 *  java Main concat 0
 *  java Main repeat 3
 *  java Main nth 5
 *  java Main reverse 0
 * }
 * </pre>
 *
 * @author Marius Guerra, Andres Arevalo && Hamrazz
 */

public class Main
{
    public static void main(final String[] args)
    {
        final Dictionary jaDictionary;
        final Wordable wordy;
        final List<String> wordsStartWithJa;



        jaDictionary = new Dictionary();
        wordsStartWithJa = jaDictionary.getWordsStartWithJa();


        // Must have two arguments to not throw an exception
        wordy  = (s,n) ->
        {
            if (args.length < 2) {
                throw new IllegalArgumentException("Insufficient arguments provided.");
            }

            String theString = "";


            if(s.equals("concat"))
            {
                theString =  String.join("", wordsStartWithJa);
                return theString;
            }

            if(s.equals("repeat"))
            {
                for(final String word: wordsStartWithJa)
                {
                    theString += word.repeat(n);
                }
                return theString;
            }

            if(s.equals("nth"))
            {
                theString = wordsStartWithJa.get(n);
                return theString;
            }

            if(s.equals("reverse"))
            {
            StringBuilder reversedWords = new StringBuilder();

              for(final String word: wordsStartWithJa)
              {
               reversedWords.append(new StringBuilder(word).reverse());
              }

              theString = String.valueOf(reversedWords);

              return theString;
            }
            return theString;
        };

        try
        {
            String test = wordy.createString(args[0], Integer.parseInt(args[1]));
            System.out.println(test);
        }
        catch(IllegalArgumentException e)
        {
            System.err.println("Error: " + e);
        }



           for (String word: wordsStartWithJa)
           {
               System.out.println(Dictionary.reverseString(word));
           }

           final String[] arrayOfJa = jaDictionary.getJaWords();

           Arrays.sort(arrayOfJa,Dictionary::alphabeticalOrder);

           System.out.println("Sorted words" + Arrays.toString(arrayOfJa));

           for (final String word : wordsStartWithJa)
           {
               if(Dictionary.isLengthAboveFive(word))
               {
                   System.out.println(word);
               }
           }
    }
}
