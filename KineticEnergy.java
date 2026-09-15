// name: oscar dumeng
// course: cmp129
// lab: week 2 Lab 1
// date: 9/15/2026

import java.util.Scanner;

public class KineticEnergy {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("enter objects mass");
        double mass = input.nextDouble();

        System.out.println("enter objects velocity");
        double velocity = input.nextDouble();

         double kineticEnergy = 0.5 * mass * Math.pow(velocity, 2);

         //System.out.println("the kinetic energy is " +  kineticEnergy);
         System.out.println("the kinetic energy is");
         System.out.printf("%.2f", kineticEnergy);

}
}