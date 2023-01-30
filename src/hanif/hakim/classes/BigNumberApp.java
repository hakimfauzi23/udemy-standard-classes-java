package hanif.hakim.classes;

import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        /**
         * Sometimes Long is not enough for a value
         * Luckily in Java  there is class to handle value bigger than a Long
         * 'BigInteger' is class for handle value is bigger than Long
         * This class is an object so there are many methods use operation.
         *
         */
        BigInteger a = new BigInteger("10000000000000000000");
        BigInteger b = new BigInteger("10000000000000000000");

        BigInteger c = a.add(b);
        System.out.println(c);
    }
}
