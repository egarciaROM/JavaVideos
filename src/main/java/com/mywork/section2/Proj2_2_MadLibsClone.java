package com.mywork.section2;
import java.util.Scanner;


public class Proj2_2_MadLibsClone {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String girls_name;
        String adjective2;
        String occupation1;
        String place;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boys_name;
        String mans_name;

        System.out.println("Gimme an adjective: ");
        adjective1 = scanner.nextLine();
        System.out.println("Gimme a girls name: ");
        girls_name = scanner.nextLine();
        System.out.println("Gimme an adjective: ");
        adjective2 = scanner.nextLine();
        System.out.println("gimme an occupation: ");
        occupation1 = scanner.nextLine();
        System.out.println("gimme a place: ");
        place = scanner.nextLine();
        System.out.println("gimme a piece of clothing: ");
        clothing = scanner.nextLine();
        System.out.println("Gimme a hobby: ");
        hobby = scanner.nextLine();
        System.out.println("Gimme an adjective: ");
        adjective3 = scanner.nextLine();
        System.out.println("gimme an occupation: ");
        occupation2 = scanner.nextLine();
        System.out.println("gimme a guys name: ");
        boys_name = scanner.nextLine();
        System.out.println("gimme mans name: ");
        mans_name = scanner.nextLine();

        System.out.println("There one was a " + adjective1 + " girl named " + girls_name + " who\n was a " + adjective2 +
                occupation1 +
                " in the kingdom of " + place + ".\n She loved to wear " + clothing +
                " and to " + hobby + ". She wanted to\n marry the " + adjective3 + " " + occupation2 + " named " + boys_name +
                " but her\n father, King " + mans_name + " forbid her from seeing him.");

        //Now on 3_2


    }
}
