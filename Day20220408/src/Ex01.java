
public class Ex01 { 

	public static void main(String[] args) {
		int sum =0;  //합계를 저장하기 위한 변수.
		int i=1;
		
		for(;i<=6;i++) {
			i++;
			sum += i; 
			System.out.println("i="+i+", sum="+sum);
		}
		System.out.println("i="+i+" Last sum="+sum);	
	}

}
