import java.util.Scanner;

public class Learn {

    public static void main(String[] args){
        //if today is tuesday, what will be the day in 100 days?
        //I know that 7 days makes a week

        int day = (100%7) + 1;

        if (day == 1){
            System.out.println("The day will be Tuesday");
        } else if (day == 2) {
            System.out.println("The day will be Wed");
        } else if (day == 3) {
            System.out.println("The day will be Thu");
        }else if (day == 4) {
            System.out.println("The day will be Fri");
        }else if (day == 5) {
            System.out.println("The day will be Sat");
        }else if (day == 6) {
            System.out.println("The day will be Sun");
        }else if (day == 7) {
            System.out.println("The day will be Mon");
        }


    }
}
