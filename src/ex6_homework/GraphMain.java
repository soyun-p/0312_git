package ex6_homework;

import java.util.Random;

public class GraphMain {
	public static void main(String[] args) {
		
		// 0 ~ 9 사이의 난수를 100개 생성하고, 각 숫자가 몇 개씩 있는지 그래프화 하시오.
		
		// 0170923804973284712384809......
		
		// 0의 갯수 : ########## (10)
		// 1의 갯수 : ####### (7)
		// ................
		// 9의 갯수 : ### (3)
		
		
		// 난수 생성
		
		int num = new Random().nextInt(9) + 0;
		
		
		// 난수 출력
		String str = "";
		
		for(int i = 0; i < 100; i++) {
			str += num;
		} // for
		
		System.out.println("난수 : " + num);
		
		Graph g = new Graph();
		g.printGraph( num, str );
		
		
	} // main

}
