package chizhenko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		System.out.println("Please enter the length of the first side");
		a = sc.nextInt();
		
		System.out.println("Please enter the length of the second side");
		b = sc.nextInt();
		
		System.out.println("Please enter the length of the third side");
		c = sc.nextInt();
		
		sc.close();
		
		if ((a + b <= c) || (b + c <= a) || (a + c <= b)) {
			System.out.println("Such a triangle can not exist");
		} else {
			System.out.println("Such a triangle can exist");
		}

	}

}
