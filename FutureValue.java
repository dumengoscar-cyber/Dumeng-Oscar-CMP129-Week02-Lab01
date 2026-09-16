//name: oscar dumeng
//course: cmp 129
//lab: week 2 lab 1
//date: 9/15/2026

import java.util.Scanner;

public class FutureValue {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //present value 
        System.out.println("enter present value");
        double presentValue = input.nextDouble();

        //monthy interest
        System.out.println("enter monthly interest rate");
        double interestRate = input.nextDouble();

        // ask for number of months 
        System.out.println("enter number of months");
        int months = input.nextInt();

        //call future value
    double future = futureValue(presentValue, interestRate, months);

    //display
    System.out.printf("future value: %.2f", future);

    }
    //calculate value 
    public static double futureValue(double presentValue, double interestRate, int months){
    return presentValue * Math.pow(1 + interestRate, months);
}
}
