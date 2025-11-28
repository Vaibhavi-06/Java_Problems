/*PROBLEM 1: STUDENT GRADE CALCULATOR 
(Conditional Statements + Exception Handling)*/

import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

class FinalGrade {
    
    static void checkMarks(int mark) throws InvalidMarksException {
        if (mark < 0 || mark > 100) {
            throw new InvalidMarksException("Marks between 0 and 100. Invalid mark: " + mark);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks for Test 1: ");
            int m1 = sc.nextInt();

            System.out.print("Enter marks for Test 2: ");
            int m2 = sc.nextInt();

            System.out.print("Enter marks for Test 3: ");
            int m3 = sc.nextInt();

            checkMarks(m1);
            checkMarks(m2);
            checkMarks(m3);

            double average = (m1 + m2 + m3) / 3.0;

            char grade;
            if (average >= 90)
                grade = 'A';
            else if (average >= 75)
                grade = 'B';
            else if (average >= 60)
                grade = 'C';
            else if (average >= 40)
                grade = 'D';
            else
                grade = 'F';

            System.out.println("Average Marks : " + average);
            System.out.println("Final Grade : " + grade);

        } catch (InvalidMarksException e) {
            System.out.println(e);
        } 
            sc.close();
       
    }
}
