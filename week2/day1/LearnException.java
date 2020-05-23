package week2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearnException {


	public static void main(String[] args) {
		System.out.println("Enter value");
		Scanner sc = new Scanner(System.in);
		int number =0;

		try {
			number =  sc.nextInt();
			System.out.println(number / 0); 
		}
		catch (ArithmeticException e) {
			System.err.println("Divisible by 0 is not possible"); 
		}catch (InputMismatchException e) {
			System.err.println("Only int");
		}


		System.out.println("Im done");




		//		System.out.println(nextInt);


	}

}
