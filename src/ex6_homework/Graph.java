package ex6_homework;

public class Graph {
	public void printGraph( int num, String str ) {
		
		// 그래프화
		
		int cnt = 0;
		
		String numCnt = "의 개수 : ";
		
		for(int i = 0; i <= 9; i++) {
			
			for(int j = 0; j < str.length(); j++) {
				
				if( str.charAt(j) == i ) {
					
					cnt++;
					
					for(int l = 0; l < cnt; l++) {
						System.out.print("#");
					} // for inner if
					
				} // if 
				
			} // for inner
			
		} // for outer

		System.out.println();
		
		
	} // printGraph()

}
