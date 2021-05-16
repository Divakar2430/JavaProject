package org.test.hexaware.login;

	public class CourseDetails {
	public void javaCourse() {
		 System.out.println("java course");
	}
	public void oracleCourse(){
		System.out.println("Oracle course");
	}
	public void pythonCourse(){
		System.out.println("Python Course");
	}
	public static void main(String[] args) {
		CourseDetails details = new CourseDetails();
		details.oracleCourse();
		details.javaCourse();
		details.pythonCourse();
	}
	}


