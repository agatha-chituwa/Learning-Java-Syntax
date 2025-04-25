public class SalaryPredictor {
    public static void main(String [] args){
        int tuition = 10000;

        //tracking given fees we want to know in 10 years how will the fees in increase if increase by 7%
        //in 10 years how much will the fees be lets start for a year


        // in 10 years
        int n = 0;
        while ( tuition < 20000){
            int increase = (int) ((7.0/100) * tuition);
            tuition = (tuition + increase);
            System.out.println("Tuition will be" + tuition );
            n++;
        }
        System.out.println("it will take " + n + " years");


    }
}
