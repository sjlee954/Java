
public class Ex03 { //int 배열 10개 랜덤으로 입력받아서 총합과 평균 구하기

	public static void main(String[] args) {
		int[] score = new int[10];
		int sum = 0;
		double aver =0;
		
			for(int i=0;i<10;i++) {
				score[i]=(int)(Math.random()*100)+1;
				sum += score[i];
			} 
			aver = sum/10.0;
			
//			for(int i=0;i<10;i++) {  보기 편하게 분리시켜도 됨.
//				sum += score[i];
				
		System.out.println("sum: "+sum);
		System.out.println("aver: "+aver);
		System.out.println("aver: "+(double)sum/score.length); //aver선언안하고 이렇게 해도 됨!
			
	}

}
