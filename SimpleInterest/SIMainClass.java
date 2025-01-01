package SimpleInterest;

import java.util.*;

class SimpleInterest { 
    double p,r,t,s;
    void getSI() {
        System.out.println("Simple Interest of principle amout "+p+" of interest rate "+r+" for a time of "+t+" is "+(s = (p*r*t)/100));
    }
}

public class SIMainClass {
    public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       SimpleInterest si = new SimpleInterest();
       System.out.println("Enter the principle amount : ");
       si.p = s.nextDouble();
       System.out.println("Enter the rate of interest amount : ");
       si.r = s.nextDouble();
       System.out.println("Enter the time in months : ");
       si.t = s.nextDouble();
       si.getSI();
    }
    
}
