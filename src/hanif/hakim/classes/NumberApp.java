package hanif.hakim.classes;

public class NumberApp {
    public static void main(String[] args) {
        /**
         * All Number DataType that's not primitive such as : Long, Integer, Short
         * are child from Number Class, and Because Number Class is not a primitive
         * all it's child has method that useful example is to convert a value
         * into different type of Number DataType (Integer to Long, Integer to Double)
         * and it's also possible to convert number value in String into Number too.
         */

        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short shortValue = intValue.shortValue();

        String stringValue = "100000";

        Integer stringToInt = Integer.valueOf(stringValue);

        System.out.println(stringToInt);

    }
}
