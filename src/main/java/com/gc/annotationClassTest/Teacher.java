package com.gc.annotationClassTest;

public class Teacher {
	public Teacher() {
	}
    public	Teacher(Student student){
    	this.student=student;
    }
	private Student student;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	

}
