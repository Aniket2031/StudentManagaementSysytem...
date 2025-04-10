package com.app;


public class Student implements StudentManangeIn{
	
	private int studId ;
	private String studName;
	private int marks[] = new int[3];
	int totalMarks;
	double percentage;
	char gread;
	
	
	public Student(int studId, String studName, int[] marks) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.marks = marks;
		this.gread = gread;
		totalmarks();
		percentage();
		gread();
	}


	public int getStudId() {
		return studId;
	}


	public void setStudId(int studId) {
		this.studId = studId;
	}


	public String getStudName() {
		return studName;
	}


	public void setStudName(String studName) {
		this.studName = studName;
	}


	public int[] getMarks() {
		return marks;
	}


	public void setMarks(int[] marks) {
		this.marks = marks;
		
		  
	}

	@Override
	public void totalmarks() {
		
	   
	   
	   for (int i = 0; i < marks.length; i++) {
		   
		   totalMarks = totalMarks+ marks[i];
		 
	   
	}
	}	
	

	@Override
	public void percentage() {
		
		 percentage = (totalMarks*100)/300;
		 
		
	}


	@Override
	public void gread() {
	
		 if(percentage >= 85.0) {
			  	System.out.println("Gread :A"); 
			  	gread = 'A';
	        }
		 else if(percentage >= 70.00 ) {
			  	System.out.println("Gread : B");
			  	gread = 'B';
			  	
	        }
		 else  if(percentage > 65.00 ) {
			  	System.out.println("Gread : C");
			  	gread = 'C';
			  	
	        }
		 else if(percentage > 55.00 ) {
			  	System.out.println("Gread : D");
			  	 gread = 'D';
			  
	        }
	
	}
		   
		   @Override
			public void displayStudentDetails() {
			   
		        System.out.println("ID: " + studId+ ", Name: " + studName + ", Total Marks: " + totalMarks + ", Percentage: " +  percentage + "%, Grade: " + gread);
		        
	}
		  
}
