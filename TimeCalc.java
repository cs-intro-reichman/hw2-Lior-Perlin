public class TimeCalc {
    public static void main(String[] args) {
        String curTime = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        if(curTime.length() != 5 || curTime.indexOf(":") != 2) {
            System.out.println("Invalid Time");
        }
        else {
            int curHours, curMinutes, addHours, addMinutes;
            curHours = Integer.parseInt(curTime.substring(0, 2));
            curMinutes = Integer.parseInt(curTime.substring(3, 5));
            // addHours = (minutesToAdd / 60) % 23;
            // addMinutes = minutesToAdd % 60;
            curMinutes = curMinutes + (minutesToAdd % 60);
            curHours += (minutesToAdd / 60);
            if(curMinutes >= 60) {
                curMinutes = curMinutes - 60;
                curHours++;
            }
            if(curHours >= 24)
            {
                curHours = curHours % 24;
            }
            String newTime = "";
            if(curHours < 10) {
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
            newTime += ":";
            if(curMinutes < 10) {
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
