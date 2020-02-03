package fmi.informatics.homeworkEvents;

public class TestEvent {

	public static void main(String[] args) {
		StandUpGuy guy = new StandUpGuy();
		Person person = new Person("Gosho", guy);
		Person person1 = new Person("Pesho", guy);
		Person person2 = new Person("Tosho", guy);
		
		guy.addGuest(person);
		guy.addGuest(person1);
		guy.addGuest(person2);
		
		guy.sayHello();
		person.greet();	
	}
}
