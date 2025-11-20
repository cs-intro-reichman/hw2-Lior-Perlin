// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int amount = Integer.parseInt(args[0]);
		if (amount <= 0) {
			System.out.println("Give me a non-negative integer");
		}
		else {
			double sum = 1.0;
			int denominator = 3;
			double temp;
			for(int i = 0; i < amount; i++) {
				if(i % 2 == 0) {
					temp = (-1.0) / denominator;
				}
				else {
					temp = 1.0 / denominator;
				}
				sum += temp;
				denominator += 2;
			}
			System.out.println("pi according to Java:	" + Math.PI);
			sum *= 4;
			System.out.println("pi, approximated:	" + sum);
		}
	}
}
