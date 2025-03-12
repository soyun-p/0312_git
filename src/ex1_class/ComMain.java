package ex1_class;

public class ComMain {
	public static void main(String[] args) {
		
		// 다형성?
		
		Computer c1 = new Computer();  // Computer클래스를 가지고 c1을 만든다.
		Computer c2 = new Computer();  // 같은 클래스를 보고 만든 c1, c2는 같은 사양의 컴퓨터이지만 메모리 주소는 다르다.
		
		System.out.println("c1");
		c1.getInfo(); // 설계도(클래스)에서 이미 모든 정보를 getInfo로 저장 및 접근 방법을 제시해놓았기 때문에 출력도 간단해진다.
		
		/*System.out.println(c1.ssd);
		System.out.println(c1.ram);
		System.out.println(c1.cpu);
		System.out.println(c1.color);  // c1.~ : c1의 특성을 참조 */
		
		// System.out.println("-----------------");
		
		System.out.println("c2");
		// company 속성은 private로 선언했기 때문에 해당 클래스가 아닌 외부 클래스에서 접근 및 사용이 불가하다.
		// c2.company = "apple";
		
		c2.ssd = 512;  // c2에서만 용량 변화가 반영된다.
		c2.getInfo();
		
		/* c2.ssd = 512;   // c2 내부에서만 값을 달리 할 수 있다.
		System.out.println(c2.ssd);
		System.out.println(c2.ram);
		System.out.println(c2.cpu);
		System.out.println(c2.color);  // 동일한 설계도(클래스)를 보고 만들었기 때문에 사양(저장된 값, 특성)이 같다. */
		
		
		
		
	} // main

}
