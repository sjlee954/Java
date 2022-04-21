import java.util.Arrays;

public class Ex12 { 
	//정수형 배열 5개 선언
	//초기화는 랜덤함수 통해서 1~100 사이값을 저장 및 출력
	
	public static void main(String[] args) {
		int[] num = new int[5];
		
		for (int i=0;i<num.length;i++)
			num[i] = (int)(Math.random()*100)+1;
			
		System.out.println(Arrays.toString(num));
	
		
		// 최댓값 및 최솟값 계산 및 출력
		//최댓값, 최솟값을 담아 줄 수있는 변수 선언
		int max =num[0];
		int min=num[0];
		
		for(int i=0;i<num.length;i++) {
			
			if(max < num[i]) 
				max = num[i];
			
			if(min > num[i]) 
				min = num[i];
			}
		
		System.out.println("max : "+max);
		System.out.println("min : "+min);
		
		//Sort (정렬)
		
		System.out.println(Arrays.toString(num));
	}

}
