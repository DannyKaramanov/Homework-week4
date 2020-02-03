package fmi.informatics.tests;

import fmi.informatics.extending.Student;

public class TestMain {

	public static void main(String[] args) {
		Student student = new Student("Danny", 1111, "PU", "Informatika", 180);
		Student studentX = new Student("Ivan", 2222, "TU", "neshto ot TU", 111);
		
		TestUnit.testUniversity(student);
		TestUnit.testUniversity(studentX);
		
		TestUnit.facNumberTest(student);
		TestUnit.facNumberTest(studentX);
	}
}
