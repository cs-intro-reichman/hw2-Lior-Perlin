// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int amount = Integer.parseInt(args[0]);
		if (amount <= 0) { // Checking the amount is according to the requirments
			System.out.println("Give me a non-negative integer");
		}
		else {
			double sum = 1.0;
			int denominator = 3; // The denominator of every step
			double temp;
			for(int i = 0; i < amount; i++) { // Entering a loop does the equation the amount requested
				if(i % 2 == 0) { // If we are at an even step, the equation should be subtraction
					temp = (-1.0) / denominator;
				}
				else { // If we are at an uneven step,  the equation should be an addition
					temp = 1.0 / denominator;
				}
				sum += temp; // Summing it all up
				denominator += 2; // Jumping the denominator to the next step
			}
			sum *= 4; // Another part of the equation
			System.out.println("pi according to Java:	" + Math.PI);
			System.out.println("pi, approximated:	" + sum);
		}
	}
}
