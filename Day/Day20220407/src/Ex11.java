
public class Ex11 { //설정한 범위내에 숫자 다 더하기 바로튀어나와야함

	public static void main(String[] args) {
		// 반복문 : 
//		for, while -> 조건이 거짓이면 실행이 한 번도 안될 수 있다.
//		do-while   -> 조건이 거짓이라도 최소 1회는 실행.
		
		int sum = 0;
		
//		for(1회만 실행; 조건이 true일 때 반복; 값은 변동)
		for(int i=0; i<=5; i++)
			sum += i;
					
		System.out.println("sum:"+ sum);
	}

}
