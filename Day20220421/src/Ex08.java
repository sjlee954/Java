import java.util.Arrays;

public class Ex08 { //실패

	public static void main(String[] args) {
		//int[] nArr = new int[10]; ==>난수 (0~9)를 배열 입력
		//단, 붙어있는 아이는 중복되면 안된다.
		
		int[] nArr = new int[10];
		
		
		for (int i=0;i<nArr.length;i++) {
			nArr[i] = (int)(Math.random()*9);
				if (i < nArr.length-2) {
					if (nArr[i]==nArr[i+1]) {
						i--;
						continue;
					}
				if (i == nArr.length-1) {
					if (nArr[i]==nArr[i-1]) {
						i--;
						continue;
					
					}
				}
			}
		}
		System.out.println(Arrays.toString(nArr));

		
	}

}
