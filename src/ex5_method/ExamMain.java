package ex5_method;

import java.util.Scanner;

public class ExamMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		int input = sc.nextInt();
		
		Test t = new Test( );
		int result = t.res( input );
		
		System.out.println("결과 : " + result);
		
	} // main

}
