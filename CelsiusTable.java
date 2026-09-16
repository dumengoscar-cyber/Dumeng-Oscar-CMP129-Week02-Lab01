// name: oscar dumeng
// course: cmp129
// lab: week 2 Lab 1
// date: 9/15/2026

public class CelsiusTable {

    public static void main(String[] args) {
        
        System.out.println("fahrenheit      celsius");

        for(int fahrenheit = 0; fahrenheit <= 20; fahrenheit++) {
           //calls the conversion and displays it
            double celsiusTemp = celsius(fahrenheit);
            System.out.printf("%d           %.2f%n" , fahrenheit, celsiusTemp);
        }
        }
//convert f to c value
        public static double celsius(double fahrenheit) {
            return (5.0 / 9.0) * (fahrenheit - 32);
        }
    }
    

