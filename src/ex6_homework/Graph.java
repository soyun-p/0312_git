package ex6_homework;

public class Graph {
	public void printGraph( int[] nArr ) {
		
		// 그래프화
		
		int cnt = 0;
		
		String shap = "#";
		String shNum = "";
		
		
		for(int i = 0; i < nArr.length; i++) {
			System.out.print(i+ "의 갯수 : ");
			
			for(int j = 0; j < nArr[i]; j++) {
				System.out.print("#");
				
			} // for inner
			
			System.out.println(" " + nArr[i]);
			
			
			
			
			
		} // for outer

		
		
		
	} // printGraph()

}
