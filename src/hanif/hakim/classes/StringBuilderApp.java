package hanif.hakim.classes;

public class StringBuilderApp {

    public static void main(String[] args) {
        /**
         * The difference String and StringBuilder :
         * StringBuilder is need less memory than String
         * So when there are task to modify much string
         * It's recommended to using StringBuilder
         */
        StringBuilder builder = new StringBuilder();

        builder.append("Hanif ");
        builder.append("Fauzi ");
        builder.append("Hakim ");
        String name = builder.toString();



        System.out.println(name);

    }

}
