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
		
		
		// 0번 ~ 9번 index 값에 따른 숫자의 갯수를 담을 배열
		int[] nArr = new int[10];  
		
		// 난수 생성 및 갯수 판단
		for(int i = 0; i < 100; i++) {
			int r = new Random().nextInt(9) + 0;
			System.out.print(r);
			nArr[r]++;  // 난수를 돌려서 해당 숫자가 나올 때마다 해당 번호의 인덱스에 위치한 값을 증가시켜서 갯수를 세도록 한다.
		} // for
		
		System.out.println();
		
		Graph g = new Graph();
		g.printGraph( nArr ); 
		
		
	} // main

}
