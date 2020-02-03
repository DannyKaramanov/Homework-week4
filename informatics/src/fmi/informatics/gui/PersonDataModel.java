package fmi.informatics.gui;

import javax.swing.table.AbstractTableModel;

import fmi.informatics.extending.Person;
import fmi.informatics.extending.Professor;
import fmi.informatics.extending.Student;

// Създаваме клас PersonDataModel
public class PersonDataModel extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	
	private Person[] people;

	// constructor
	public PersonDataModel(Person[] people) {
		this.people = people;
	}

	@Override
	public int getColumnCount() {
		return 8; // брой колони в таблицата
	}

	@Override
	public int getRowCount() {
		return people.length; // брой редове в таблицата
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
			case 0:
				return people[rowIndex].getName();
			case 1:
				return people[rowIndex].getEgn();
			case 2: 
				if (people[rowIndex] instanceof Student) {
					String speciality = ((Student)people[rowIndex]).getSpeciality();
					return speciality;
				}else {
					return " ";
				}
			case 3:
				if (people[rowIndex] instanceof Professor) {
					String title = ((Professor)people[rowIndex]).getTitle();
					return title;
				}else {
					return "Student ";
				}
			case 4:
				if(people[rowIndex] instanceof Student) {
					int facnum = ((Student) people[rowIndex]).getFacNumber();
					return facnum;
				}else {
					return "No FacNumber";
				}
			case 5:
				return people[rowIndex].getAge();
			case 6:
				return people[rowIndex].getHeight();
			case 7:
				return people[rowIndex].getWeight();
		}
		return null;
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
			case 0:
				return "Име";
			case 1:
				return "ЕГН";
			case 2:
				return "Специалност";
			case 3:
				return "Титла";
			case 4:
				return "Ф-н номер";
			case 5:
				return "Години";
			case 6:
				return "Височина";
			case 7:
				return "Тегло";
	
			default:
				return super.getColumnName(column);
		}
	}
}
