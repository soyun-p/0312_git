package ex4_orchard;

public class Orchard {
	
	public void result( int apple, int pear, int orange ) { // 파라미터의 순서도 매우 중요
		
		int total = apple + pear + orange;
		float avg = total / 24f;
		
		System.out.printf("하루 생산량 : %d\n", total);
		System.out.printf("시간당 평균 : %.1f\n", avg);
		
		
		
	}

}
