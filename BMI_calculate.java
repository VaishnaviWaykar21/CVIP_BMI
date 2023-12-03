import java.io.*; 
import java.util.*;
class BMI_calculate
{ 
    public static double BMI(double height, double weight) 
    { 
        double bmi = weight / Math.pow(height, 2); 
        return bmi; 
    } 
    
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in kilogram: ");
        double weight = sc.nextDouble();
        System.out.print("Input height in meters: ");
        double height = sc.nextDouble();
        
        
        
        double bmi = BMI(height, weight); 
        System.out.print("The BMI is " + bmi + " so "); 
        
        
        if (bmi < 18.5) 
            System.out.print("underweight"); 
  
        else if (bmi >= 18.5 && bmi < 24.9) 
            System.out.print("Healthy"); 
  
        else if (bmi >= 24.9 && bmi < 30) 
            System.out.print("overweight"); 
  
        else if(bmi >= 30) 
            System.out.print("Suffering from Obesity"); 
    } 
}
