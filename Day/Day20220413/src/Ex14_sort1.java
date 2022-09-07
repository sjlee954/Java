import java.util.Arrays;

public class Ex14_sort1 {  //p.201 5-10 Sort (정렬)
	

	public static void main(String[] args) {
		int[] num = new int[5];
		
		for (int i=0;i<num.length;i++) {
			num[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(num));
		
		
		for (int i=0;i<num.length-1;i++) {
			boolean changed = false; //자리바꿈이 발생했는지를 체크한다.
		
			for(int j=0;j<num.length-1-i;j++) {
				if (num[j] > num[j+1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
					changed = true;  //자리바꿈이 발생했으니 true로 대입한다.
			}
		}// end for j
			
			if (!changed) break;  //자리바꿈이 없으면 반복문을 벗어난다.
			
			for (int k=0; k<num.length;k++)
				System.out.printf("%d"+" ",num[k]);

			System.out.println();
		}//end for i
	
	}

}
