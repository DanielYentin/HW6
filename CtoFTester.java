/*
    Q. What should the functions have as parameter(s)? 
    A. The functions should take in their respective tempertures

    Q. What type should they be?
    A. They should be doubles to account for decimal degrees

    Q. What should the functions return?
    A. The functions should return their respective converted temnpertures
*/

public class CtoFTester{

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * (9.0/5.0) + 32);
    }
    static double fahrenheitToCelsius(double fahrenheit) {
        return ((fahrenheit - 32) * (5.0/9.0));
    }
    public static void main(String[] args) {
        System.out.println("0 celsius is equivilent to " + celsiusToFahrenheit(0) + " fahrenheit");
        System.out.println("32 fahrenheit is equivilent to " + fahrenheitToCelsius(32) + " celsius"); 
      }
}
