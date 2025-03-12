package ex1_class;

public class Computer {
	
	// 클래스의 구성 요소	
	// 변수(속성, 멤버)
	// 메서드(함수)
	
	private String company = "samsung";
	int ssd = 256;
	int ram = 16;
	float cpu = 2.4f;
	String color = "white";
	
	
	// 컴퓨터의 사양을 확인하기 위한 메서드
	// 메서드 : 어떤 작업을 수행하기 위한 명령문들의 집합. 반복적으로 사용되는 코드를 줄이기 위해 필요.
	
	// 접근제한자 변환형  메서드명( 인자, 파라미터, 매개변수 ) { 실행 영역 }
	// public  void  getInfo() { } 
	public void getInfo() {
		
		System.out.println("제조사 : " + company);
		System.out.println("ssd : " + ssd + "GB");
		System.out.println("ram : " + ram + "GB");
		System.out.println("cpu : " + cpu + "GHz");
		System.out.println("color : " + color);
		System.out.println("--------------------------");
		
	} // getInfo()
	
	
	// 접근제한자
	// 1. public : 같은 프로젝트 내의 모든 객체에게 사용을 허가.
	// 2. private : 현재 클래스에서만 사용을 허가. 외부 클래스에서는 접근 및 사용 불가능.
	// 3. protected : 상속관계의 객체들에게만 사용을 허가.
	// 4. default : 기본값. 같은 패키지의 모든 객체에게 사용을 허가. 변수 앞에 아무것도 안 쓴 것이 디폴트 상황.

}
