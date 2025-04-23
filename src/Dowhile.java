import  java.util.Scanner;


public class Dowhile {
    public  static  void main(String [] args){

        Scanner input = new Scanner(System.in);
        int num1 = 125;
        int num2  = 2525;
        int gcd = 1;

        for(int i = 2; i<=num1 || i<= num2 ; i++){
            if(num1 % i == 0 && num2%i == 0){
                gcd = i;


            }

        }
        System.out.println("the gcd is " + gcd );
        
    }
}
