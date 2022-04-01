import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operator;
		BigDecimal num1, num2, result=BigDecimal.ZERO;
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		
		System.out.println("Choose an operator: +, -, *, / or %");
		operator = input.next().charAt(0);
		
		System.out.println("Enter first number");
		num1 = input.nextBigDecimal();
		
		System.out.println("Enter second number");
		num2 = input.nextBigDecimal();
		
		switch(operator) {
		case '+':
			result = Operation.sum(num1, num2);
			
			break;
		case '-':
			result = Operation.sub(num1, num2);
			break;
		case '*':
			result = Operation.mul(num1, num2);
			break;
		case '/':
			result = Operation.div(num1, num2);
			break;
		case '%':
			result = Operation.mod(num1, num2);
			break;
			
			default:
				System.out.println("Invalid operator!");
				break;
		
		}
		input.close();
		
		System.out.println("Result: " + num1.doubleValue() + operator + num2.doubleValue() + " = " + result.doubleValue() );
		
	}

}
