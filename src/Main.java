import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //This creates a new scanner system.
        Scanner sc = new Scanner(System.in);
        //This asks the user to input their numeric grade.
        System.out.println("Hello! What is your grade?");
        //This defines the user's input as a double named 'grade' to be used later.
        double grade = Double.parseDouble(sc.nextLine());
        //This begins the "if" sequence by defining an A as above or equal to 92.00.
        if (grade >= 92.00) {
            //This outputs the letter grade "A" if the above statement is true.
            System.out.println("Your letter grade is an 'A'.");
            //This defines an A- as above or equal to 89.00
        } else if (grade >= 89.00) {
            //This outputs the letter grade "A-" if the above statement is true.
            System.out.println("Your letter grade is an 'A-'.");
            //This defines the grade "B+" as above or equal to 87.00.
        } else if (grade >= 87.00) {
            //This outputs the letter grade "B+" if the above statement is true.
            System.out.println("Your letter grade is a 'B+'.");
            //This defines the grade "B" as above or equal to 82.00.
        } else if (grade >= 82.00) {
            //This outputs the letter grade "B" if the above statement is true.
            System.out.println("Your letter grade is a 'B'.");
            //This defines the grade "B-" as above or equal to 79.00.
        } else if (grade >= 79.00) {
            //This outputs the letter grade "B-" if the above statement is true.
            System.out.println("Your letter grade is a 'B-'.");
            //This defines the grade "C+" as above or equal to 77.00.
        } else if (grade >= 77.00) {
            //This outputs the letter grade "C+" if the above statement is true.
            System.out.println("Your letter grade is a 'C+'.");
            //This defines the grade "C" as above or equal to 72.00.
        } else if (grade >= 72.00) {
            //This outputs the letter grade "C" if the above statement is true.
            System.out.println("Your letter grade is a 'C'.");
            //This defines the grade "C-" as above or equal to 69.00.
        } else if (grade >= 69.00) {
            //This outputs the letter grade "C-" if the above statement is true.
            System.out.println("Your letter grade is a 'C-'.");
            //This defines the grade "D+" as above or equal to 67.00.
        } else if (grade >= 67.00) {
            //This outputs the letter grade "D+" if the above statement is true.
            System.out.println("Your letter grade is a 'D+'.");
            //This defines the grade "D" as above or equal to 60.00.
        } else if (grade >= 60.00) {
            //This outputs the letter grade "D" if the above statement is true.
            System.out.println("Your letter grade is a 'D'.");
            //This sets the automatic response if all other "if" tests fail.
        } else {
            //This outputs the letter grade "F" if all other "if" tests fail.
            System.out.println("Your letter grade is an 'F'.");
        }
    }
    }
