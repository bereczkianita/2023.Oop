package oop.labor02;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int validCount = 0;
        int invalidCount = 0;

        for (int i = 0; i < 1000; i++) {
            int year = random.nextInt(200) + 1821;
            int month = random.nextInt(12) + 1;
            int day = random.nextInt(31) + 1;

            try {
                MyDate date = new MyDate(year, month, day);
                System.out.println(date);
                validCount++;
            } catch (IllegalArgumentException e) {
                invalidCount++;
            }
        }

        System.out.println("\nValid dates generated: " + validCount);
        System.out.println("Invalid dates generated: " + invalidCount);
    }
}
