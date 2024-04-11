package aston;

import java.util.Scanner;

public class str {
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Введите строку 1 - ");
	
	String str1 = scanner.nextLine();
	
	System.out.println("Введите строку 2 ");
	
	String str2 = scanner.nextLine();
 

		if(str1.equals(str2)) {
	    	System.out.print("Строки идентичны");
		}else {
			System.out.print("Строки неидентичны");
		}
	} 

}