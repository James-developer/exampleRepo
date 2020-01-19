import java.util.Scanner;
// new text
public class Test {
	public static void main(String[] args) {
		// creating a set
		Set set = new Set();
		String choice = "";
		// defining a scanner example
		Scanner scanner = new Scanner(System.in);
		// looping infinitely
		while (true) {
			// getting command
			System.out.print("Enter command: ");
			choice = scanner.nextLine();
			// command to terminate the program. Uncomment it if you
			 if (choice.equalsIgnoreCase("exit")) { break; }
			// splitting command by white space
			String terms[] = choice.split(" ");
			//checking if resultant array contains two elements
			if (terms.length == 2) {
				//getting command, performing required operations
				if (terms[0].trim().equalsIgnoreCase("add")) {
					try {
						int number = Integer.parseInt(terms[1]);
						set.add(number);
						System.out.println(set);
					} catch (Exception e) {
						System.out.println("Invalid input, try again!");
					}
				} else if (terms[0].trim().equalsIgnoreCase("del")) {
					try {
						int number = Integer.parseInt(terms[1]);
						set.delete(number);
						System.out.println(set);
					} catch (Exception e) {
						System.out.println("Invalid input, try again!");
					}
				} else if (terms[0].trim().equalsIgnoreCase("exists")) {
					try {
						int number = Integer.parseInt(terms[1]);
						System.out.println(set.exists(number));
					} catch (Exception e) {
						System.out.println("Invalid input, try again!");
					}
				} else {
					System.out.println("Invalid command!");
				}
			} else {
				System.out.println("Usage should be <command><space><number>");
			}	
		}
	}
}
