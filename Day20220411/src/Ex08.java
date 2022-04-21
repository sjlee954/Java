
public class Ex08 {

	public static void main(String[] args) {
		//지역변수, 전역변수
		int sum = 0;
		int i=1;
				
		for (i=1;i<=100;i++) {
			if(sum>100)
				break;
			sum += i;
		}
		System.out.println("회전횟수: "+i+","+"sum: "+sum);
	}

}
