package work02;

import java.util.Scanner;

public class PrimeMain {
	public static void main(String[] args) {
		
		
		// 소수 판단
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int n = sc.nextInt();
		
		PrimeNumber pn = new PrimeNumber();
		pn.iam_prime( n );
		
		
		
		
		
		
	} // main

}
