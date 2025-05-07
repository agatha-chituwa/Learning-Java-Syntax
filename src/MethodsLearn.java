public class MethodsLearn {
    public static void main(String args []){
        int num1 = 1;
        int num2 = 2;
            System.out.println("Before invoking the swap method, num1 is " +
                    num1 + " and num2 is " + num2);
            swap(num1, num2);
    }
     public static void increment(int x){
        x++;
        System.out.println("inside the call, x is " + x);
    }
    public static void swap(int num1, int num2){
        int x = num1;
        num1 = num2;
        num2 = x;
        System.out.println("\t\tAfter swapping, num1 is " + num1
                      + " and num2 is " + num2);

    }
}
