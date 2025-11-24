// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		char type = args[1].charAt(0);
		if(N <= 0 && type != 'v' && type != 'c')  { // Checking the inputs are according to the requirments
        		System.out.println("Give me a solid non-negative integer and either “v” (verbose) or “c” (concise) ");
        }
		else {
			int counter; // Counter for steps
			String line; // Creates the string for output line
			int currNum; // Number to manipulate
			for(int i = 1; i <= N; i++) // First loop in order to go through every seed
			{
				counter = 1; // Zeroing all variables to sure all are refreshed for new hailstone
				currNum = i;
				line = currNum + " "; // Resets line
				do { // Second loop to go though all steps
					// Checking if its even or odd number
					if(currNum % 2 == 0) { // Even number
						currNum /= 2;
					}
					else { // Odd number
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

// 1 4 2 1 (4)
// 2 1 (2)
// 3 10 5 16 8 4 2 1 (8)
// 4 2 1 (3)
// 5 16 8 4 2 1 (6)
// 6 3 10 5 16 8 4 2 1 (9)
// 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 (17)
// 8 4 2 1 (4)
// 9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 (20)
// 10 5 16 8 4 2 1 (7)
// Every one of the first 10 hailstone sequences reached 1.

// 1 4 2 1 (3)
// 2 1 (1)
// 3 10 5 16 8 4 2 1 (7)
// 4 2 1 (2)
// 5 16 8 4 2 1 (5)
// 6 3 10 5 16 8 4 2 1 (8)
// 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 (16)
// 8 4 2 1 (3)
// 9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 (19)
// 10 5 16 8 4 2 1 (6)
// Every one of the first 10 hailstone sequences reached 1.