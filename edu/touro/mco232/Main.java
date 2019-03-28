package edu.touro.mco232;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Person p = new Person();

        Object o = new Object();
        
        //o = p;
        
        if (o instanceof Person) {
            p = (Person) o;
            System.out.println("Casted");
        }
        
        p.talk();
        
        System.out.println("\n");
        
        GitCamper nechemia = new Nechemia();
    }

    private static void doStuff() {

        Scanner keyboard = new Scanner(System.in);

        Date date = new Date();

        boolean invalidDate = true;

        do {

            try {
                System.out.println("Enter date: ");
                String dateString = keyboard.nextLine();
                date = new Date(dateString);
                invalidDate = false;
            } catch (InvalidDayInMonthException e) {
                System.out.println(e);
            } catch (InvalidDateException e) {
                System.out.println(e);
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            }

        } while (invalidDate);

        System.out.println(date);
    }

}
