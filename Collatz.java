// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		char type = args[1].charAt(0);
		if(N <= 0 && type != 'v' && type != 'c')  { // Making sure all inputs are correct
        		System.out.println("Give me a solid non-negative integer and either “v” (verbose) or “c” (concise) ");
        }
		else {
			int counter; // Counter for steps
			String line; // Creates the string for output line
			int currNum; // Number to manipulate
			for(int i = 1; i <= N; i++) // First loop in order to go through every seed
			{
				counter = 0; // Zeroing all variables to sure all are refreshed for new hailstone
				currNum = i;
				line = currNum + " ";
				do { // Second loop to go though all steps
					// Checking if its even or odd number
					if(currNum % 2 == 0) { //even
						currNum /= 2;
					}
					else { // Odd
						currNum *= 3;
						currNum++;
					}
					line += currNum + " ";
					counter++;
				} while(currNum != 1);
				line += "(" +counter+")";
				if(type == 'v') { // Checked if we wanted a verbuse or concise output
					System.out.println(line);
				}
			}
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");

		}
	}
}
