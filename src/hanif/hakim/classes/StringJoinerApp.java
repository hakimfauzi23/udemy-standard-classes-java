package hanif.hakim.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(",","[","]");

        joiner.add("Hakim");
        joiner.add("Fauzi");
        joiner.add("Hakim");

        String value = joiner.toString();
        System.out.println(value);

    }
}
