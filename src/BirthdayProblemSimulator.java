/**
 * A simulator for the birthday problem. Allows for configuration of number of
 * birthdays, number of people, and number of instances to run.
 * 
 * @author Ian Mays
 */
public class BirthdayProblemSimulator {
	private int daysInYear;
	private int people;
	private int instances;
	
	/**
	 * Constructs a new birthday problem simulator.
	 * @param days The number of birthdays to choose from
	 * @param peeps The number of people in each room
	 * @param runs The total number of rooms to simulate
	 */
	public BirthdayProblemSimulator(int days, int peeps, int runs) {
		daysInYear = days;
		people = peeps;
		instances = runs;
	}
	
	/**
	 * Estimates the probability of two people sharing a birthday in a room of a given
	 * size and a given number of birthdays, by random sampling.
	 * @return The proportion of rooms which contained at least two people with
	 * matching birthdays
	 */
	public double run() {
		int successes = 0;
		
		for (int i = 0; i < instances; i++) {
			BirthdayProblemInstance instance = new BirthdayProblemInstance(daysInYear, people);
			
			if (instance.hasMatch()) {
				successes++;
			}
		}
		
		return (double) successes/instances;
	}
}
