import java.util.Arrays;

public class Ex12 { //5-14

	public static void main(String[] args) {
		
		int[][] score = { {100,100,100}, 
				          {20,20,20,20},
				          {40,40,40,40,40},
				          {50,50,50,50,50,50} 
				         }; //2행 3열
			
		for (int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++)
				System.out.print(score[i][j]+"\t");
			System.out.println();
		}
		
	
	
	}
		

}
