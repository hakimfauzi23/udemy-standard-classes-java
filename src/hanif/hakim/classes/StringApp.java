package hanif.hakim.classes;

public class StringApp {

    public static void main(String[] args) {
        /**
        * Java have usable classes for modified String
        * String as we know data type is an object too
        * And Object also have method in it
        * There are so many usable method for modified String.
         * */

        String name = "Hanif Fauzi Hakim";

        // Will create new string without change 'name' value
        String nameLowercase = name.toLowerCase();

        System.out.println(name);
        System.out.println(nameLowercase);
        System.out.println(nameLowercase.length());
        System.out.println(nameLowercase.startsWith("hanif"));


    }
}
