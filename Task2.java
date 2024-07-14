package codeS;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of subjects");
		int subnum = input.nextInt();
		
		int totalMarks = 0;
		int[] marksArray = new int[subnum];
		
		for(int i = 0; i < subnum; i++) {
			System.out.println("Enter marks you obtained in a subject " + (i + 1) + ":");
			marksArray[i] = input.nextInt();
			totalMarks += marksArray[i];
		}
		
		double avePercentage = (double) totalMarks / subnum;
		
		char grade;
		if(avePercentage >= 90) {
			grade = 'A';
		}else if(avePercentage >= 80) {
			grade = 'B';
		}else if(avePercentage >= 70) {
			grade = 'C';
		}else if(avePercentage >= 60) {
			grade = 'D';
		}else if(avePercentage >= 50) {
			grade = 'E';
		}else {
			grade = 'F';
		}
		
		System.out.println("Total Marks " + totalMarks);
		System.out.println("Average Percentage " + avePercentage + "%");
		System.out.println("Grade " + grade);
		
		input.close();

	}

}
