package TemparatureConversion;
import java.util.*;


class TempConverter {
    double f,c;
    void convertToFahrenheit(){
        System.out.println("Conversion of Celsius "+c+" to Fahrenheit  is "+(f = c * (9/5)+32));
    }
    void convertToCelsius(){
        System.out.println("Conversion of Fahrenheit "+f+" to Celsius  is "+(c = (f-32)*(5/9)));
    }
} 

public class TempConMainClass {
    public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    TempConverter tc = new TempConverter();
    int conv;
    System.out.println("Enter the conversion operation  : 1)toFahrenheit 2)toCelsius");
    conv = s.nextInt();
    switch (conv) {
        case 1:
            System.out.println("Enter the Celsius Degress : ");
            tc.c=s.nextDouble();
            tc.convertToFahrenheit();
            break;
        case 2:
            System.out.println("Enter the Fahrenheit Degress : ");
            tc.f=s.nextDouble();
            tc.convertToCelsius();
            break;
        default:
            System.out.println("Invalid operation selected ");
            break;
    }
}
}