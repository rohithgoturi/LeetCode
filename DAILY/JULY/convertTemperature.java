public class convertTemperature {
    public static double[] Temperature(double celsius) {
        double Kelvin = celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;

        double[] ans = {Kelvin, Fahrenheit};
        return ans;
    }

    public static void main(String[] args) {
        double celsius = 25.0;
        
        double[] result = Temperature(celsius);
        System.out.println("Kelvin: " + result[0] + ", Fahrenheit: " + result[1]);
    }
}
