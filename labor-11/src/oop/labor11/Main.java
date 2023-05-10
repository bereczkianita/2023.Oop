package oop.labor11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<MyDate> dates = new ArrayList<MyDate>();

        int currentYear = LocalDate.now().getYear();
        for (int i = 0; i < 10; i++) {
            int year = currentYear;
            int month = (int) (Math.random() * 12) + 1;
            int day = (int) (Math.random() * 28) + 1;
            MyDate date = new MyDate(year, month, day);
            dates.add(date);
        }

        System.out.println("Unsorted dates:");
        for (MyDate date : dates) {
            System.out.println(date);
        }

        List<MyDate> dateList = new ArrayList<>();
       // Collections.sort(dateList);


        System.out.println("Sorted dates:");
        for (MyDate date : dates) {
            System.out.println(date);
        }
    }
}



