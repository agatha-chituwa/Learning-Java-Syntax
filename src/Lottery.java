import java.util.Scanner;

public class Lottery {
    public static void main(String [] args){

        //get user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 2 digit number");
        int input_number = input.nextInt();

        //generate a two digit random number
        int random_number = (int)(Math.random() * 99);
        System.out.println("The generated number " + random_number);

        //Extracting the last digit of both the random number and user inputed number
        int lastdigit1 = input_number % 10;
        int lastdigit2 = random_number % 10;

        //first digit extraction
        int digits1 = (int)(Math.log10(input_number));
        int firstdigit1 = (int)(input_number / (int)(Math.pow(10, digits1)));
        int digits2 = (int)(Math.log10(random_number));
        int firstdigit2 = (int)(random_number / (int)(Math.pow(10, digits2)));

        if (firstdigit1 == firstdigit2 && lastdigit1 == lastdigit2 ){ // if the number is exactly the same
            System.out.println("You have won $" + 10000);

        } else if (firstdigit1 == lastdigit2 || lastdigit1 == firstdigit2 ) { //if number is correct but in the opposite direction
            System.out.println("You have won $" + 3000);
        }else if (firstdigit1 == firstdigit2 || lastdigit1 == lastdigit2 ) { //if only one number is correct
            System.out.println("You have won $" + 1000);
        }else {
            System.out.println("i am sorry you have not won anything this round, Try again next time "); // else if no match condition
        }


    }
}
