import java.util.Arrays;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] iArr1 = new int[5]; //5칸이 10칸으로 확장 공사

		int[] tmp = new int[iArr1.length*2];
		
		
		for (int i =0;i<iArr1.length;i++) {
			iArr1[i]=(int)(Math.random()*10)+1;  //1~10의 숫자를 순서대로 배열에 넣는다.
		}
		System.out.println(Arrays.toString(iArr1));
		
		for (int i =0; i<iArr1.length; i++) 
			tmp[i]= iArr1[i];
		System.out.println(Arrays.toString(tmp));
			
		iArr1 = tmp;
		System.out.println(Arrays.toString(iArr1));
	}

}
