package ex4_orchard;

import java.util.Scanner;

public class OrchardMain {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사과 : ");
		int apple = sc.nextInt();
		
		System.out.println("배 : ");
		int pear = sc.nextInt();
		
		System.out.println("오렌지 : ");
		int orange = sc.nextInt();
		
		Orchard orc = new Orchard();
		orc.result( apple, pear, orange );
		
		
		
	} // main

}
