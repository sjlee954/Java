import java.util.Arrays;

public class Ex02 { //함수이용한 sort

	public static void main(String[] args) {
		   // 정수형 배열 5개 선언
	      // 초기화는 랜덤함수 통해서 1~100 사이값을 저장 및 출력

	      int[] num = new int[5];

	      for (int i = 0; i < num.length; i++) {
	         num[i] = (int)(Math.random() *100) + 1;
	      }
	      System.out.println(Arrays.toString(num));

	      sort(num);

	   }

	   public static void sort(int[] num) {
	      for (int i = 0; i < num.length-1; i++) {
	         for (int j = i+1; j < num.length; j++) {
	            if(num[i] > num[j]) {
	               int min = num[i];
	               num[i] = num[j];
	               num[j] = min;
	            }
	         }
	      }

	      System.out.println(Arrays.toString(num));
	}

}
