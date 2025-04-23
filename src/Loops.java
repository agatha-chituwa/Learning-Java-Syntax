import  java.util.Scanner;

public class Loops {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        //subtraction statements
        //spice things up if you got 2/5 but in percentage
        int count = 0;
        double percentage = 0;
while(count < 5) {
    int number1 = (int) (Math.random() * 100);
    int number2 = (int) (Math.random() * 100); //needs to be repeated


    if (number2 > number1) {
        int temp = number2;
        number2 = number1;
        number1 = temp;

    }
    System.out.println("What is " + number1 + " - " + number2 + " ?");
    int answer = input.nextInt();

    if (answer == (number1 - number2)) {
        System.out.println("You are correct");
        percentage++;
    } else {
        System.out.println("You are wrong");
    }
    count++;
}

        percentage = (percentage / count) * 100;
        //generate 5 different questions using loops
        System.out.println("your score is " + percentage + "%");
    }
}
