package ex2_method;

public class MethodMain {
	public static void main(String[] args) {
		
		// 메소드 호출됨 을 호출하고 싶을 땐?
		
		MethodTest m1 = new MethodTest();
		// m1.test();    // m1 객체 내의 test()를 실행하라는 의미
		// m1 객체(MethodTest)를 생성해놨고, m1을 참조하여 출력했기 때문에 m1 객체 내의 출력문이 실행된다.
		
		int su = 5;
		su = m1.test(su);
		
		System.out.println("su : " + su);  
		
		
		
		
		
	} // main
	
	
	

}
