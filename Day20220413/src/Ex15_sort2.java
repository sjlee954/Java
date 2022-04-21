import java.util.Arrays;

public class Ex15_sort2 {

	public static void main(String[] args) {
		int[] num = new int[5];
		
		for (int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*10);
		}
		System.out.println("정렬 전:"+Arrays.toString(num));
		
		for (int i =0;i<num.length;i++) {
			for(int j =i;j<num.length;j++) {
				if (num[i]>num[j]) {
					int tmp = num[i];
					num[i]= num[j];
					num[j]= tmp;
				}
			}
		}
		System.out.println("정렬 후: "+Arrays.toString(num));
	}

}
