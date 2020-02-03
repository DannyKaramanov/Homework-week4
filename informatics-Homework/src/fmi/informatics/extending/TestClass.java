package fmi.informatics.extending;

import java.util.ArrayList;
import java.util.List;


public class TestClass {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	
		 //HOMEWORK
		  Homework hw = new Homework();
		  ArrayList<Person> test = hw.fillpeople();
		    
		  Homework.showStats(test);
		  
		  testAnonymousClass();
		  StudentInstance();	  
	}
	
	
	// Създайте анонимен клас, който да имплементира интерфейса - Adaptable.
	//<водейки се по упражнението>
	public static void testAnonymousClass() {
		Student student = new Student("Danny", 1111, "PU", "5555", 1212) {
			@Override
			public void study() {
				System.out.println("\nThe student is trying to study about anonymous classes");
				
			}

			@Override
			public void think() {
				System.out.println("The student is trying to finish this homework sooner because the gym is waiting");
				
			}

			@Override
			public void act() {
				System.out.println("The student is acting like he knows what he's doing");
				
			}
	};
	student.study();
	student.think();
	student.act();
}
	//Проучете методите Class.forName() и Class.newInstance() и ги използвайте, за да създадете инстанция на клас Student
	public static void StudentInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		
		Student StudentInstance = (Student) Class.forName(Student.class.getName()).newInstance();
		System.out.println("\nThe class name is: " + Student.class.forName(Student.class.getName()));
		
	}

	}