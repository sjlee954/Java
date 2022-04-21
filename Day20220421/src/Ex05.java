import java.util.Arrays;

public class Ex05 { //Arrays.equals(null, null2) 메서드를 이용한 배열비교 방법.

	public static void main(String[] args) {
		
		int[] nArr1 = {10,20,30,40,50};
		int[] nArr2 = {10,20,30,40,50};
		
		ArrayEqual(nArr1, nArr2);
		
	}
	static void ArrayEqual(int[] nArr1, int[] nArr2) {
		
		System.out.println(Arrays.equals(nArr1, nArr2));

	}

}
