package aston;

import java.util.Scanner;

public class Compares {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите 1 число: ");
		
		int num1 = scanner.nextInt();
		
        System.out.print("Введите 2 число: ");
		
		int num2 = scanner.nextInt();
		
		if(num1 > num2) {
			System.out.print(num1 + " > " + num2);
		} else if(num1 < num2) {
			System.out.print(num1 + " < " + num2);
		} else if(num1 == num2) {
			System.out.print(num1 + " = " + num2);
		}
		
		
		
	}

}
