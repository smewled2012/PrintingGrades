package com.melak.library.org;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String anOtherScore = "Y";
        while (! anOtherScore.equalsIgnoreCase("N")){
            System.out.print("Enter an exam score: ");
            String input = keyboard.nextLine();
            int score = Integer.parseInt(input);
            if (score>=97){
                System.out.println("You did a great job. your grade is A+.");
            }else if (score>=94){
                System.out.println("You did a great job. your grade is A.");
            }else if (score>=90){
                System.out.println("You did a great job. your grade is A-.");
            }else if (score>=87){
                System.out.println("You did a good job. your grade is B+.");
            }else if (score>=84){
                System.out.println("You did a good job. your grade is B.");
            }else if (score>=80){
                System.out.println("You did a good job. your grade is B-.");
            }else if (score>77){
                System.out.println("Your grade is C+.");
            }else if (score>74){
                System.out.println("Your grade is C.");
            }else if (score>70){
                System.out.println("Your grade is C-");
            }else if (score>=60){
                System.out.println("Your grade is D.");
            }else if(score<60){
                System.out.println("Please Go back to School1.");
            }
            System.out.println("Do you want to Enter another exam score?(Y/N)");
            anOtherScore = keyboard.nextLine();
        }
    }
}