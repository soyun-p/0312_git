package work02;

public class PrimeNumber {
	
	public void iam_prime( int num ) {
		
		for(int i = 2; i < num; i++) {
			
			if( num % i != 0 ) {
				System.out.println("소수입니다.");
			}else {
				System.out.println("소수가 아닙니다.");
			} // if-else
			
		} // for
		
		
		/* int cnt = 0;
		 if( num % i == 0 ) {
		     cnt++; 
		 }  // for문 안의 if문
		 // for문 나와서
		 아래를 주석처리 + 반환형을 int로 하고, return cnt; 입력하면 메인 클래스의 n은 1이 된다.
		 if( cnt == 1 ) { // 오직 자기자신만 나누어 떨어지기 때문에 cnt = 1이다.
		     System.out.println("소수입니다.");
		 }else{
		     System.out.println("소수가 아닙니다.");
		 }
		 */
		
		
	} // iam_prime()

}
