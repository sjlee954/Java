
public class Ex07 { //p.174 4-29예제를 for문으로 바꾼것

	public static void main(String[] args) {
		
		for (int i =1;i<=100; i++) {
			System.out.printf("i=%d",i);
			
			int tmp = i;
			
			for (;;) {
				if (tmp %10 %3==0 && tmp %10 !=0)	 //3의배수인지 확인(0제외)
					System.out.print("짝");
				
				if ((tmp /= 10) == 0) 
					break;	
			} 
			System.out.println();
		}
	}
}
