/**
 * A single simulation of the birthday problem.
 * 
 * @author Ian Mays
 */
public class BirthdayProblemInstance {
	private Person[] people;
	
	/**
	 * Constructs a new simulation of the birthday problem.
	 * @param days The number of birthdays to choose from
	 * @param peeps The number of people in the room
	 */
	public BirthdayProblemInstance(int days, int peeps) {
		people = new Person[peeps];
		
		for (int i = 0; i < peeps; i++) {
			people[i] = new Person(days);
		}
	}
	
	/**
	 * Tests whether there are two people in the room with matching birthdays.
	 * @return true if a match is found, false otherwise
	 */
	public boolean hasMatch() {
		for (int i = 0; i < people.length; i++) {
			for (int j = i+1; j < people.length; j++) {
				if (people[i].getBirthday() == people[j].getBirthday()) {
					return true;
				}
			}
		}
		
		return false;
	}
}
