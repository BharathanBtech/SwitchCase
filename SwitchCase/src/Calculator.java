import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input a first value:");
        float NumberOne = input.nextFloat();

        
        System.out.println("Select a operation +-*/:");
        char Opera = input.next().charAt(0);
     
        
        System.out.println("Input a Second value:");
        float NumberTwo = input.nextFloat();
        float result;

        switch (Opera)
        {
        case '+' :
        	result= NumberOne+NumberTwo;
        	System.out.println("Result is :"+ result);
        	break;
        	
        case '-' :
        	result= NumberOne-NumberTwo;
           	System.out.println("Result is :"+ result);
        	break;
 
        case '*' :
        	result= NumberOne*NumberTwo;
           	System.out.println("Result is :"+ result);
        	break;
        	
        case '/' :
        	if(NumberTwo!=0)
        	{
            	result= NumberOne/NumberTwo;
               	System.out.println("Result is :"+ result);
            	break;	
        	}
        	
        	
        default:
            System.out.println("Error: Invalid operator.");
        }
    }
}
