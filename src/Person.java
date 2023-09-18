import java.util.Random;

/**
 * An individual person with a specific birthday.
 * 
 * @author Ian Mays
 */
public class Person {
	Random random = new Random();
	private int birthday;
	
	/**
	 * Constructs a new Person with a random birthday.
	 * @param daysInYear The number of possible birthdays, each with an equal chance
	 * of occurring
	 */
	public Person(int daysInYear) {
		birthday = random.nextInt(daysInYear);
	}
	
	/**
	 * Gets a Person's birthday
	 * @return The birthday, as an integer
	 */
	public int getBirthday() {
		return birthday;
	}
}