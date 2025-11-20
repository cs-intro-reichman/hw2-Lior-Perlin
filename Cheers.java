//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String cheering = args[0];
            int amountOfCheers = Integer.parseInt(args[1]);
            if(amountOfCheers <= 0 || cheering.length() == 0)  {
                System.out.println("Give me a solid string and a non-negative integer");
            }
            else {
                cheering = cheering.toUpperCase();
                String specialLetters = "AEFHILMNORSX";
                String shouts = "";
                for(int i = 0; i < cheering.length(); i++) {
                        shouts = "Give me ";
                        if( specialLetters.indexOf(cheering.charAt(i)) != -1) {
                                shouts += "an ";
                        }
                        else {
                                shouts += "a ";
                        }
                        shouts += cheering.charAt(i) + ": " + cheering.charAt(i) + "!";
                        System.out.println(shouts);
                }
                System.out.println("What does that spell?");
                for(int i = 0; i < amountOfCheers; i++) {
                        System.out.println(cheering + "!!!");
                }
            }
        }
}
