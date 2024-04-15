package grades_Class;

import java.util.Scanner;

public class Stats_Grades {

	public static void main(String[] args) {
		//Outline program variables and create scanner object for the user input process.
		Scanner scnr = new Scanner(System.in);
		float grades = 0.0f;
		float gradeSum = 0.0f;
		float gradeCount = 0.0f;
		float maxGrade = 0.0f;
		float minGrade = 100.0f;
		float avgGrade = 0.0f;
		
		//User input messages for number of students and the following grades.
		System.out.println("How many students are you grading today?");
		gradeCount = scnr.nextFloat();
		System.out.println("Enter grades: ");
		
		//For-loop that will request grade input until number of students is reached.
		for (int i = 0; i < gradeCount; i++) {
			grades = scnr.nextFloat();
			
			if (grades < 0 || grades > 100) {
				System.out.println("Enter a correct number between 0 and 100, please.");
				grades = scnr.nextFloat();
			}
			
			if (grades > maxGrade) {
				maxGrade = grades;
			}
			
			if (grades < minGrade) {
				minGrade = grades;
			}
			
			//gradeSum adds all the grades together and avgGrades divides gradeSum by gradeCount.
			gradeSum += grades;
			avgGrade = (gradeSum / gradeCount);
		}
		
		//Final display output to print the maximum, minimum, and average class grades.
		System.out.println("The maximum grade for this class was: " + maxGrade + '%');
		System.out.println("The minimum grade for this class was: " + minGrade + '%');
		System.out.println("Which would make the average grade for this class: " + avgGrade + '%');
	}

}
