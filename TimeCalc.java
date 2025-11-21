public class TimeCalc {
    public static void main(String[] args) {
        String curTime = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        if(curTime.length() != 5 || curTime.indexOf(":") != 2) { // Checking the inputs are according to the requirments
            System.out.println("Invalid Time");
        }
        else {
            int curHours, curMinutes;
            curHours = Integer.parseInt(curTime.substring(0, 2)); // Receiving the amount from the relevant indexs
            curMinutes = Integer.parseInt(curTime.substring(3, 5)); // Receiving the amount from the relevant indexs
            curMinutes = curMinutes + (minutesToAdd % 60); // Adding the minutes
            curHours += (minutesToAdd / 60); // Adding the hours
            if(curMinutes >= 60) { // If the minutes we added exceed 60, we need to add an hour and make sure we're not over 60
                curMinutes = curMinutes - 60;
                curHours++;
            }
            if(curHours >= 24) // If the hours we added exceed 23, we need to make sure we go back to a 24H time method
            {
                curHours = curHours % 24;
            }
            String newTime = ""; // Creating the new time after adding the minutes
            if(curHours < 10) { // Checking if we need to add "0" or "00" at the beginning to make sure the hour are written up to standarts
                if(curHours == 0) {
                    newTime += "00";
                }
                else {
                    newTime += "0" + curHours;
                }
            }
            else {
                newTime += curHours;
            }
            newTime += ":"; // Adding a colon between HH to MM
            if(curMinutes < 10) { // Checking if we need to add "0" or "00" at the beginning to make sure the minutes are written up to standarts
                if(curMinutes == 0) {
                    newTime += "00";
                }
                else {
                    newTime += "0" + curMinutes;
                }
            }
            else {
                newTime += curMinutes;
            }
            System.out.println(newTime);
        }
    }
}
