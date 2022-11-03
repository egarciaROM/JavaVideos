package com.mywork.section3;

public class ControlStatementsIntro {
    public static void main(String[] args) {
        int age = 15;
        if(age >= 16){
            System.out.println("You can drive");
        }
        else{
            System.out.println("can't drive yet");
        }
        //System.out.println(age);
        for (int i = 1; i <= age; i++) {
            System.out.println("Happy Birthday " + i);

        }
    }//end main
}
//End of 3_2