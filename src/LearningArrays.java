import  java.util.Scanner;
public class LearningArrays {
    public  static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int [] myList = new int[10];
        
        //assign values
        //analyzing numbers
        int average =  myList[0];
        int count = 0;
        int sum = 0;
        for (int i =0; i< myList.length; i++){
            myList[i] = (int) (Math.random()*100);
            sum = sum + myList[i];
        }
        average = sum  / myList.length;
        for (int i =0; i< myList.length; i++){
            if(myList[i] > average){
                count++;

            }
        }
        for (int i = 0;  i < myList.length; i++){
            System.out.println("Hello world");
        }
        System.out.println("there are  " + count + " above average and average is" + average);
    }

}

