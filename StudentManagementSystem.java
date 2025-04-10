package com.app;

import java.util.Scanner;

public class StudentManagementSystem  extends Student{
	
	static Student[] stu = new Student[100];
	static int count = 0;
	static Scanner sc = new Scanner(System.in);
	
	public StudentManagementSystem(int studId, String studName, int[] marks) {
		super(studId, studName, marks);
		
	}
	
	  	
	 private static  void viewStudents() {
		        if (count == 0) {
		            System.out.println("No students found!");
		        } else {
		            System.out.println("Student List");
		            for (int i = 0; i < count; i++) {
		                stu[i].displayStudentDetails();
		            }
		        }
		    }
		
	   public static void main(String[] args) {
		   
		   if (count == 0) {
	            System.out.println("data not avalable firstly add student");
	        } else {
	            System.out.println("\nStudent List");
	            for (int i = 0; i < count; i++) {
	                stu[i].displayStudentDetails();
	            }
	        }
		   
		
		while(true) {
			
		System.out.println("Student Management System :");
		System.out.println("Press 1 :"+"Add Student");
		System.out.println("Press 2 :"+"View Student");
		System.out.println("Press 3 :"+"Exist");
		System.out.println("Enter your choice");
		int choice1 = sc.nextInt();
		
		switch(choice1) {
		
		case  1 : AddStudentDetail() ;
		break;
		
		case 2 : viewStudents();
		break;
		
		case 3 : System.out.println("System Exit"); 
		break;
		
		default : System.out.println("Invalid choice !!! Try agin....");
		}

		}
	   }
	   
	   static void AddStudentDetail() {
	        if (count >= stu.length) {
	            System.out.println("Student list is full!");
	            return;
	        }
	        System.out.print("Enter Student ID: ");
	        int id = sc.nextInt();
	        sc.nextLine(); // Consume newline
	        System.out.print("Enter Student Name: ");
	        String name = sc.nextLine();
	        int[] marks = new int[3];
	        for (int i = 0; i < 3; i++) {
	            System.out.print("Enter marks for Subject " + ( i + 1 ) + ": ");
	            marks[i] = sc.nextInt();
	        }
	        stu[count++] = new Student(id, name, marks);
	        System.out.println("Student added successfully!");
	        
	        
	      

	   }	
	}

