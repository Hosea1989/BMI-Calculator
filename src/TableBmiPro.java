/*
* Assignment:Project 3
* Description: This program calculates the users BMI using their height, inches and weight. If the users BMI is less
*              25 or greater than 25 then it will be displayed to the user.
* Name: Damien Hosea
* ID: 921395901
* Class: CSC 210 -07
* Semester: Fall 2020
 */

import java.util.Scanner;

public class TableBmiPro {

        public static void main (String[]args){

            //Scanner for input
            Scanner input = new Scanner(System.in);

            //***** INTRO *****
            System.out.println(" Welcome");
            System.out.println("Enter Feet and Inches: ");
            int height = input.nextInt();
            int inches = input.nextInt();

            //System.out.println(" Okay, I got: " + height + "and " + inches);

            System.out.println("Enter Lowest Weight: ");
            int lowWeight = input.nextInt();

            System.out.println("Enter Highest Weight: ");
            int highWeight = input.nextInt();

            //This if statement will swap the highest and lowest for an accurate result.
            if (lowWeight > highWeight) {
                int holder = lowWeight;
                lowWeight = highWeight;
                highWeight = holder;
            }

            //This if statement will check to see if the highest and lowest scores are 5 pounds apart.
            if ( (highWeight - lowWeight) < 5){
                System.out.println(" Your highest and lowest weight must be 5 pounds apart");
                System.exit(1);
            }

            // System.out.println("Okay, I got: " + lowWeight + " and " + highWeight);

            //This variable holds total inches.
            int totalInches = (height * 12) + inches;

            System.out.println("Weight " + "  " + " BMI " + " " + "      Condition");

            while (lowWeight <= highWeight)  {
                //System.out.println("The BMI is " + (float)Bmi) ; // FIX THE OUTPUT HERE

                //This is the formula to calculate the users BMI.
                double Bmi = ((lowWeight * 703.0) / (totalInches * totalInches));

                //This output statement will add 4 decimal places for accurate numbers.
                System.out.print(lowWeight + "       " + (int)(Bmi * 10000) / 10000.0 + "   " ) ;

                //This if statement will help determine if the users is overweight or not.
                if ( Bmi < 25.0) {
                    System.out.println(" Not Overweight");
                }
                else if (Bmi >= 25.0) {
                    System.out.println( " Overweight");
                }

                //System.out.println(result);
                //This will increment the lowest weight counter by 5 pounds.
                lowWeight += 5;
            }
        }
}