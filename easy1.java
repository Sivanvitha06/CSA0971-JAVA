import java.util.*;
class easy1{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
        	System.out.println("Enter first number: ");
		double num1 = sc.nextDouble();
       		System.out.println("Enter second number: ");
                double num2 = sc.nextDouble();
       	        System.out.println("Enter an operator (+, -, /): ");
 	        char operator = sc.next().charAt(0);
        	double result = 0;
                switch (operator) {
            		case '+':
                		result = num1 + num2;
               		        break;
                        case '-':
               	 		result = num1 - num2;
                		break;
            		case '/':
                		if (num2 != 0) {
                    			result = num1 / num2;
                		} else {
                    			System.out.println("Error! Division by zero.");
                    			return;
                			}
                			break;
            	        default:
                		System.out.println("Error! Invalid operator.");
                		return;
       		 }
        
        	System.out.println("The result is: " + result);
    }
}
