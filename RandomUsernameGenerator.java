import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * RandomUsernameGenerator
 */
public class RandomUsernameGenerator {

    // class variable
    final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";

    final Random rand = new java.util.Random();

    // consider using a Map<String,Boolean> to say whether the identifier is being
    // used or not
    final Set<String> identifiers = new HashSet<String>();

    /**
     * Generates the random user name
     * @return
     */
    public String randomIdentifier() {
        StringBuilder builder = new StringBuilder();
        while (builder.toString().length() == 0) {
            int length = rand.nextInt(10) + 5;
            for (int i = 0; i < length; i++) {
                builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
            }
            if (identifiers.contains(builder.toString())) {
                builder = new StringBuilder();
            }
        }
        return builder.toString();
    }
    
}