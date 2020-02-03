package fmi.informatics.tests;
import fmi.informatics.extending.Student;

public class TestUnit {

	public static void facNumberTest(Student student) {
		int ExpectedFacNumber = 180;
		int facNumResult = student.getFacNumber();
		
		if (intEqual(ExpectedFacNumber, facNumResult)) {
			System.out.println("The student's facNumber is: 180");
		} else {
			System.err.println(
					"The student's facNumber is: " + facNumResult + ", but the expected facNumber is: " + ExpectedFacNumber);
		}
	}

	public static void testUniversity(Student student) {
		String expectedUniversity = "PU";
		String resultUniversity = student.getUniversity();
		
		if (areEqual(resultUniversity, expectedUniversity)) {
			System.out.println("The student is studying at PU");
		} else {
			System.out.println(
					"The student is studying at " +	resultUniversity + ",but the expected university is " + expectedUniversity);
		}
	}
	
	public static boolean areEqual(String result, String expectedresult){
		 return result.equals(expectedresult);
		}
	
	public static boolean intEqual(int result, int expectedresult) {
		return java.util.Objects.equals(result, expectedresult);
	}
}
