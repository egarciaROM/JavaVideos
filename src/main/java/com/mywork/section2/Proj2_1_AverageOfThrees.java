package com.mywork.section2;
import java.math.BigDecimal;
import java.util.Scanner;

/*
* Prompt for 3 different real numbers
* Print out average
*
* */

public class Proj2_1_AverageOfThrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getThree(scanner));
        System.out.println(getThreeTeacher(scanner));

    }
    public static double getThree(Scanner scan){
        double lum = 0;
        String sum;
        System.out.println("Please enter three numbers: ");
        sum = scan.nextLine();
        String[] nums = sum.split(" ");
        for (String x : nums
             ) {
            lum += Double.valueOf(x);

        }
        return lum/3;
    }
    public static double getThreeTeacher(Scanner scan){
        double sum = 0;
        System.out.println("Please enter three numbers: ");
        sum += scan.nextDouble();
        sum += scan.nextDouble();
        sum += scan.nextDouble();
        scan.nextLine();
        return sum/3.0;

    }

}
