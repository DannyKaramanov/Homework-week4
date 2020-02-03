package fmi.informatics.homeworkEvents;

import java.util.ArrayList;

public class StandUpGuy implements Party {
	
	private ArrayList<Guest> people = new ArrayList<>();
	private boolean isHere;
	
	@Override
	public void addGuest(Guest g) {
		people.add(g);
		
	}

	@Override
	public void removeGuest(Guest g) {
		people.remove(g);
	}

	@Override
	public void sayHello() {
		System.out.println("Zdraveite");
		for(Guest guest: people) {
			guest.update();
		}
	}
	
	public boolean isGuestHere() {
		return isHere;
	}
	
	public void setIsHere(boolean here) {
		this.isHere = here;
		if (isHere) {
			sayHello();
		}
	}
} 
