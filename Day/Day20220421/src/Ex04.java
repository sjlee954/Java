import java.util.Arrays;

public class Ex04 { //배열을 string으로 바꾼후 string비교 메서드인 str.equals(str2)를 이용한 방법.

	public static void main(String[] args) {
		
		int[] nArr1 = {10,20,30,40,50};
		int[] nArr2 = {10,20,30,40,50};
		
        String str = Arrays.toString(nArr1);
        String str2 = Arrays.toString(nArr2);
        
        ArrayEqual(str, str2);
		
	}
	static void ArrayEqual(String str, String str2) {
		
		System.out.println(str.equals(str2));
		
	}

}
