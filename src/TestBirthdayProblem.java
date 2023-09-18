/**
 * Uses a BirthdayProblemSimulator to calculate the approximate probability of two
 * people sharing a birthday in a room with a certain number of occupants, and prints
 * the result as a percentage.
 * 
 * @author Ian Mays
 */
public class TestBirthdayProblem {
	public static void main(String[] args) {
		BirthdayProblemSimulator simulator = new BirthdayProblemSimulator(365, 23, 10000);
		System.out.printf("Probability: %.2f%%", simulator.run()*100);
	}
}