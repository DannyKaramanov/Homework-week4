package fmi.informatics.extending;

import java.util.ArrayList;

import fmi.informatics.composition.RichStudent2;

public class Homework {
	
	//Да се създаде ArrayList<Person> и да се напълни с няколко инстанции на Professor, Student и RichStudent2.
			 ArrayList<Person> people = new ArrayList<>();
		
			public ArrayList<Person> fillpeople() {
				
				Student Danny = new Student("Danny", 00000 , "PU", "Informatics", 11111);
				people.add(Danny);
				
				Student DannyX = new Student("DannyX", 11111 , "PU", "BIT", 0000);
				people.add(DannyX);
				
				Professor Ivan = new Professor("Professor", "Ivan", true, 25, 180, 80);
				people.add(Ivan);
				
				Professor Ivan2 = new Professor("Professor", "Ivan2", true, 25, 180, 80);
				people.add(Ivan2);
				
				RichStudent2 Eli = new RichStudent2("Eli", 99999, "PU", "Informatics", 111111);
				people.add(Eli);
				
				RichStudent2 EliY = new RichStudent2("EliY", 66666, "PU", "STD", 22222);
				people.add(EliY);
				
				return people;
			}
			//Създайте някъде метод: public static void showStats(ArrayList<Person> people) , който принтира в конзолата статистики колко човека в people са от
			//тип Professor, Student, RichStudent2 и общия брой хора в people.
			
			public static void showStats(ArrayList<Person> people) {
				int numberProf = 0;
				int numberRichS = 0;
				int numberStu = 0;
				
				for (Person p : people) {
					if (p instanceof Professor) {
						numberProf++;
						//След като студентите учат, професорите не трябва да бездействат...
						p.goBar();
					}
					if (p instanceof RichStudent2) {
						numberRichS++;
					}
					if (p instanceof Student) {
						numberStu++;
						//Променете метода showStats() да извиква метода study() на
						//всички инстанции, които са от тип Student и RichStudent2.
						p.study();
					}
					
				}
				System.out.println("\nThe number of Professors is: " + numberProf +
				"\nThe number of RichStudent2 is: " + numberRichS + "\nThe number of Students is: " + numberStu + "\nThe number of all people is: " + people.size() );
				
			}
			
			
}
