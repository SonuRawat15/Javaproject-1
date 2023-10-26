public class InterestCalculator{
 
  
        // Principal amount
        double principal ;

        // Annual interest rate (in decimal form)
        double annualRate ;

        // Number of times interest is compounded per year
        int compoundingFrequency ; // Monthly compounding

        // Number of years
        int years;
void calculateinterest(){
  
        // Calculate compound interest
        double amount = principal * Math.pow(1 + (annualRate / compoundingFrequency), compoundingFrequency * years);

        // Calculate the interest earned
        double interest = amount - principal;

        System.out.println("Principal: " + principal);
        System.out.println("Compound Interest: " + interest);
        System.out.println("Total Amount: " + amount);
}
    
}
