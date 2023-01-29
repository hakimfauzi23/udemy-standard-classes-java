package hanif.hakim.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {

        /**
         * Simply StringTokenizer has same function like String.split()
         * the difference is StringTokenizer is Lazy Load and use less memory than String.split()
         * Lazy Load : Is when load only required string, not load everything at once.
         */
        String value = "Hanif Fauzi Hakim";
        StringTokenizer tokenizer = new StringTokenizer(value," ");

        while(tokenizer.hasMoreTokens()) {
            String result = tokenizer.nextToken();
            System.out.println(result);
        }
    }
}
