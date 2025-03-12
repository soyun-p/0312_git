package ex2_method;

public class MethodTest {
	
	// 연습용 메서드
	
	// void 이외의 변환형 타입이 명시되어 있다면 해당 메서드는 반드시 return을 한 개 이상 가지고 있어야 한다.
	
	public int test( int n ) { // 파라미터 호출. main에서 사용할 때 꼭 파라미터 넣어줘야 한다.
		n += 100;
		System.out.println("n : " + n);	
		return n;  
		// 리턴값은 반드시 메서드 앞 자료형과 같아야 함.
		// 리턴 값은 반드시 한 개만 있어야 한다.
		// 리턴 아래 그 어떤 실행문도 실행될 수 없다.
		
		// test() 에서 main으로 값을 보낼 때는 파라미터로, main에서 test()에 값을 반환할 때에는 return을 사용한다.
		
	
	} // test()
	
	
	public void test2() {
		System.out.println("test2");
		return;  // void일 때는 반환할 값이 없지만, 리턴 사용 가능. 그러나 값이 반환될 수 없다.
	}
	
	

}
