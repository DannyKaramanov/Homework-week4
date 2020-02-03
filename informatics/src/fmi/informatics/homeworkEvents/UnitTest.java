package fmi.informatics.homeworkEvents;

public class UnitTest {
	public static void main(String[] args) {
		StandUpGuy party = new StandUpGuy();
		Person questToTest = new Person("Gosho", party);
		String myName = "Gosho";
		if( myName.equals(questToTest.getName())){
			System.out.println("This test works");
			
		}else{
		System.out.println("This test doesn't work");
		}
	}
}
