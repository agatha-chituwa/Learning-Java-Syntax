import java.util.Scanner;

public class Selections {

    public static void main(String [] args){
        //computing taxes using if statements
        Scanner input  = new Scanner(System.in);


        System.out.println("\"(0-single filer, 1-married jointly or \" +\n" +
                " 10 \"qualifying widow(er), 2-married separately, 3-head of \" +\n" +
                " 11 \"household) Enter the filing status: \"");
        int status = input.nextInt();

        System.out.println("Enter the Taxable income");
        int income = input.nextInt();


        Double tax1;
        Double tax2;
        Double tax3;
        Double tax4;
        Double tax5;
        Double tax6;
        double temp;
        double totalTax;
        if (status == 0){
            if (income <= 8350){
                tax1 = (10.0/100) * income;
                System.out.println("the tax is " + tax1);
            } else if (income >= 8351 && income <= 33950 ) {
                tax1 = (10.0/100) * 8350;
                income = income - 8350;
                tax2 = (15.0/100) * income;
                totalTax = tax1 + tax2;
                System.out.println("the tax is " + totalTax);
            } else if (income >= 33951 && income <= 82250) {
                tax1 = (10.0/100) * 8350;
                tax2 = (15.0/100) * (33950 - 8350);
                income = income - 33950;
                tax3 = (25.0/100) * income;
                totalTax = tax1 + tax2+tax3;
                System.out.println("the tax is " + tax1 + " " + tax2  + " "+tax3 + " " +" is " + totalTax);
            } else if (income >= 82251 && income <= 171550  ) {
                tax1 = (10.0/100) * 8350;
                tax2 = (15.0/100) * (33950 - 8350);
                tax3 = (25.0/100) * (82250 -33950);
                income = income - 82250;
                tax4 = (28.0/ 100) * income;
                totalTax = tax1 + tax2 +tax3 + tax4;
                System.out.println("the tax is " + tax1 + " " + tax2  + " "+tax3 + " " +" is " + totalTax);
            } else if (income >= 171551 && income <= 372950) {
                tax1 = (10.0/100) * 8350;
                tax2 = (15.0/100) * (33950 - 8350);
                tax3 = (25.0/100) * (82250 -33950);
                tax4 = (28.0/ 100) * (171550 - 82250);
                income = income - 171550;
                tax5 = (33.0/ 100) * income;
                totalTax = tax1+tax2+tax3+tax4 +tax5;
                System.out.println("the tax is " + tax1 + " " + tax2  + " "+tax3 + tax4 + tax5 + " " +" is " + totalTax);

            } else  {
                tax1 = (10.0/100) * 8350;
                tax2 = (15.0/100) * (33950 - 8350);
                tax3 = (25.0/100) * (82250 -33950);
                tax4 = (28.0/ 100) * (171550 - 82250);
                tax5 = (33.0/ 100) * (372950-171550);
                income = income - 372950;
                tax6 = (35.0/ 100) * income;
                totalTax = tax1+tax2+tax3+tax4 +tax5 + tax6;
                System.out.println("the total tax is "  + totalTax);
            }


        } else if (status ==1) {
            //will compute taxes for those who are married filing jointly here
        } else if (status ==2) {
            //will compute taxes for those who are married filing separately here
        }else if (status == 3){
            //will compute taxes for head of the household here
        }else {
            //any wrong number entered will be shown here
        }



        //will compute taxes for those who are single here
        //honestly I don't know how to approach this but let's try
        //we'll use nested if statements in here

        // i thisnk i should first check if

//            if(income > 0 && income <= 8350){
//                //let's calculate tax which will be 10%
//                tax = (10.0/100) * income;
//                System.out.println("the tax is " + tax);
//            } else if (income > 8350 ) {
//
//            }
//        if (income <= 8350){
//            tax = (10.0/100) * income;
//            System.out.println("the tax is " + tax);
//        }
//        if (income > 8350){
//            if (income < 33950){
//                tax = (10.0/100) * 8350;
//                income = income - 8350;
//                temp = (15.0/100) * income;
//                totalTax = tax + temp;
//                System.out.println("the tax is " + totalTax + " income is " + income);
//
//            } else if (income < 82250) {
//                tax = (10.0/100) * 8350;
//                income = income - 8350;
//                temp = (15.0/100) * income;
//                income = income - 33950;
//                totalTax = ((25.0/100) * income) + tax + temp;
//                System.out.println("the tax is " + totalTax + " income is " + income);
//
//            }
//        }


    }
}
