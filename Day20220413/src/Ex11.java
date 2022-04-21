import java.util.Arrays;

public class Ex11 {

	public static void main(String[] args) {
		int[] abc = {10,20,30,40,50};
		int[] abc2 = {1,2,3,4,5,6,7,8,9};
//		int[] abc2 = {1,2,30,40,50,6,7,8,9};
	
		System.out.println(Arrays.toString(abc));
		System.out.println(Arrays.toString(abc2));
		
		System.arraycopy(abc, 2, abc2, 2, 3);
		System.out.println(Arrays.toString(abc2));
		
		
	}

}
