package work01;

public class Gugudan {
	public void printGugu( int dan ) {
		
		for(int i = 1; i <= 9; i++) {
			
			if( dan < 1 || dan > 9 ) {
				System.out.println("올바른 값을 입력하세요.");
				break;
			}else {
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
				
			}
			
			
			
		} // for
		
		
		
		
		
		
	} // printGugu()

}
