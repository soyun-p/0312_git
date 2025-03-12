package work03;

public class Test { // class B
	public void result( int n1, int n2 ) {
		
		// 입력받은 값들의 최소공배수 구하기
		
		
		if( n1 > n2 ) {
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		} // if
		
		
		for(int i = 1; i < n1 * n2; i++) {
			
			if( i % n1 == 0 && i % n2 == 0 ) {
				System.out.println("최소공배수 : " + i);
				break;
			} // if
			
		} // for
		
		
		
		
		
		
	} // result()

}
