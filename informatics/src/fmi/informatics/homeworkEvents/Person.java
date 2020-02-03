package fmi.informatics.homeworkEvents;

public class Person implements Guest {
	private String name;
	private Party party;
	
	public Person(String name, Party party) {
		this.name = name;
		this.party = party;
	}
	public String getName() {
		return name;
	}
	
	public void goHome() {
		party.removeGuest(this);
	}
	
	public void greet() {
		System.out.println(name + " says Hello to the " + party.getClass().getSimpleName());
	}

	@Override
	public void update() {
		greet();
		goHome();
	}
}
