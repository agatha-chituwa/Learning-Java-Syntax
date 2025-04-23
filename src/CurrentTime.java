public class CurrentTime {
    public static void main(String [] args){
        //to get the current time
        Long totalMilliseconds = System.currentTimeMillis();

        //these are milliseconds so calculate the total milliseconds since midnight jan 1970
        Long totalSeconds = totalMilliseconds/ 1000;

        Long currentSecond = totalSeconds%60;

        //total minutes so 60sec = 1 minute
        Long totalMinutes = totalSeconds/60;
        Long currentMinute = totalMinutes%60;

        //Total hours
        Long totalHours = totalMinutes /60;
        Long currentHour = totalHours%24;
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + "(GMT)");
    }
}
