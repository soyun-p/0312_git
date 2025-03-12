package ex3_method;

import java.util.Scanner;

public class Calculator {
	// 설계도 목적으로 만들어진 클래스에는 메인이 없다
	public void calc( int su1, int su2, String op ) {
		
		switch( op ) {
		case "+":
			System.out.printf("%d + %d = %d\n", su1, su2, su1 + su2);
			break;
			
		case "-":
			System.out.printf("%d - %d = %d\n", su1, su2, su1 - su2);
			break;
			
		case "x":
			System.out.printf("%d x %d = %d\n", su1, su2, su1 * su2);
			break;
		
		} // switch
		

		
		
		
		
		
	} // calc()
	
	

}
