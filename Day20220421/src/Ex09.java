import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex09 {
	//int[] nArr = new int[10]; ==>난수 (1~10)를 배열 입력
	//단, 붙어있는 아이는 중복되면 안된다.
	
	public static void main(String[] args) {
		Random rand = new Random(7); //숫자 7의미
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 개수 입력 >>");
		int n = sc.nextInt();
		int[] nArr = new int[n];
		
		nArr[0] =rand.nextInt(10);
		
		for (int i=1;i<nArr.length;i++) {
			do {
				nArr[i] = rand.nextInt(10); //숫자 의미
			} while (nArr[i]== nArr[i-1]);
		}
		System.out.println(Arrays.toString(nArr));
	}

}
