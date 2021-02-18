import java.util.Scanner;

public class Mathematics {

      	public static void main(String[] args)
      	{
      	       //We use a scanner to enter the numbers
      		Scanner input = new Scanner(System.in);
      		System.out.println("Enter the number 1 : ");
      		double number1 = input.nextInt();
      		
      		System.out.println("Enter the number 2 : ");
      		double number2 = input.nextInt();
      		
      		System.out.println("Enter the number 3 : ");
      		double number3 = input.nextDouble();


      		System.out.println("Enter the number 3 : ");
      		double number4 = input.nextDouble();

      		System.out.println();
      		division(number1, number2, number3,number3);
      		System.out.println();
      		Multiply(number1, number2, number3,number3);
      		System.out.println();
      		minus(number1, number2, number3,number3);
      		System.out.println();
      		sum(number1, number2, number3,number3);
      	}

      	public static double division(double num1, double num2, double num3,double num4) {

      		double result = num1 / num2 / num3/num4;
      		
      		System.out.println("The division is " + result);

      		return result;

      		
      	}
      	public static double Multiply (double num1, double num2, double num3,double num4) {

  		double result = num1 * num2 * num3*num4;
  		
  		System.out.println("The Multiply  is " + result);

  		return result;

  		
  	}
      	public static double minus(double num1, double num2, double num3,double num4) {

  		double result = num1 - num2 - num3-num4;
  		
  		System.out.println("The minus is " + result);

  		return result;

  		
  	}
      	public static double sum(double num1, double num2, double num3,double num4) {

  		double result = num1 + num2 + num3+num4;
  		
  		System.out.println("The sum is " + result);

  		return result;

      }
  

    }


