// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String cheering = args[0];
            int amountOfCheers = Integer.parseInt(args[1]);
            if(amountOfCheers <= 0 || cheering.length() == 0)  { // Checking the inputs are according to the requirments
                System.out.println("Give me a solid string and a non-negative integer");
            }
            else {
                cheering = cheering.toUpperCase(); // Making sure all the cheerings are Uppercase
                String specialLetters = "AEFHILMNORSX"; // Variable for special letters with "an" at the start
                String shouts = "";
                for(int i = 0; i < cheering.length(); i++) { // Entering a loop to go thourgh every latter of the word cheered for
                        shouts = "Give me "; // Resets the string and starts a new shout
                        if( specialLetters.indexOf(cheering.charAt(i)) != -1) { // Checking if its a special letter
                                shouts += "an ";
                        }
                        else { // If not a special letter
                                shouts += "a  ";
                        }
                        shouts += cheering.charAt(i) + ": " + cheering.charAt(i) + "!"; // Adding the letter to the shout
                        System.out.println(shouts);
                }
                System.out.println("What does that spell?");
                for(int i = 0; i < amountOfCheers; i++) { // Enters loop to shout the amount of times requested
                        System.out.println(cheering + "!!!");
                }
            }
        }
}
