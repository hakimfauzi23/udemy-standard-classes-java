package hanif.hakim.classes;

import java.util.Scanner;

public class ScannerApp {

    public static void main(String[] args) {
        /**
         * Scanner class used to get User Input
         * the return value is various such as String, int, etc
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name : ");
        String name = scanner.nextLine();

        System.out.print("Age : ");
        Integer age = scanner.nextInt();

        System.out.println("Hello "+ name);
        System.out.println("Your age is: "+age);
    }
}
