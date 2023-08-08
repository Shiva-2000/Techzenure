package com.techzenure.shivakumar.day4;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ArrayCase {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the Student name: ");
//		String name = sc.nextLine();
//		
//		System.out.print("Enter the Number of Subjects: ");
//		int subjects = sc.nextInt();
//		
//		int[] marks = new int[subjects];
//		
//		marksEntry(marks);
//		System.out.println("Marks entered = " + Arrays.toString(marks));
//		printMarks(name,marks);
//		sc.close();
//	}
//
//	private static void printMarks(String name, int[] marks) {
//		System.out.println(" Student Name :" + name.toUpperCase()+ "\n");
//		System.out.println("subject\t\tmarks");
//		for(int i=0; i<marks.length; i++) {
//			System.out.println("Subject -"+ (i+1) + "\t\t" + marks[i]);
//		}
//		
//		
//	}
//
//	private static void marksEntry(int[] marks) {
//		for(int i=0; i<marks.length; i++) {
//			System.out.print("Enter marks for subject - " + (i+1) + ": ");
//			marks[i] =sc.nextInt();
//		}
//		
//	}
//	
//}
  
//package com.techzenure.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCase {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {	
		
		System.out.print("enter student name: ");
		String name = sc.nextLine();
		
		System.out.print("enter no of subjects: ");
		int noOfSubjects = sc.nextInt();
		
		int[] marks = new int[noOfSubjects];
		
		marksEntry(marks);
		System.out.println("marks entered = " + Arrays.toString(marks));
		printMarks(name, marks);
		sc.close();
	}


	private static void marksEntry(int[] marks) {
		for(int i=0; i<marks.length; i++) {
			System.out.print("enter mark for Subject-"+(i+1)+": ");
			marks[i] = sc.nextInt();
		}
		
	}

	private static void printMarks(String name, int[] marks) {
		System.out.println();
		System.out.println("STUDENT'S REPORT CARD");
		System.out.println("STUDENT NAME: " + name.toUpperCase()+"\n");
		System.out.println("  SUBJECT\t\tMARKS");
		
		for(int i=0; i<marks.length; i++) {
			System.out.println("Subject-"+(i+1) + "\t\t  " + marks[i]);
			
		}	
		System.out.println("------------------------------");
		
	}	

}

	

