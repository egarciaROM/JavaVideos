package com.mywork.section2;
import java.util.Scanner;

public class KeyBoardInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        double num;
        System.out.println("gimme a number: ");
        num = scanner.nextDouble();
        num *= 2;
        scanner.nextLine();
        System.out.println("Number given is : " + num);
        System.out.println("What is your name?: ");
        name = scanner.nextLine();

        System.out.println("what is your age?: ");
        age = scanner.nextInt();
        scanner.nextLine(); //Gets rid of newline character
        System.out.println("Hello, " + name + " age is " + age);



    }
}
