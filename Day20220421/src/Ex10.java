import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		//int[] nArr = new int[10]; ==>난수 (1~10)를 배열 입력
		//단, 전체 숫자가 중복되면 안된다.
		
//		nArr[i]= rand.nextInt(10); //0~9사이의 값
		
		Random rand = new Random(); //숫자 7의미??
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 개수 입력 >>");
		int n = sc.nextInt();
		int[] nArr = new int[n];
		
		nArr[0] =rand.nextInt(10);
		
		for (int i=0;i<nArr.length;i++) { 
			int j;
			do { 
				j = 0; 
				nArr[i]= rand.nextInt(10)+1; //1~10사이의 값
				
				for(; j<i;j++)
					if (nArr[j]==nArr[i])
						break;
				} while (j<i);
			}
	
		System.out.println(Arrays.toString(nArr));
	}

}
