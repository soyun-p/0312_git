package work01;

import java.util.Scanner;

public class GugudanMain { // class A
	public static void main(String[] args) {
		
		// 클래스 A에서 입력받은 값에 해당하는 구구단을 클래스 B에서 출력하는 코드.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단 : ");
		int dan = sc.nextInt();
		
		Gugudan g = new Gugudan();
		g.printGugu( dan );
		
		
		
		
		
	} // main

}
