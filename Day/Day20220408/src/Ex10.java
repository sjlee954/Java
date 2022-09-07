
public class Ex10 { //랜덤 숫자 6개 뽑기 (겹칠 수있음.)->배열사용해야 함 추후에 배열때 다시 배움.

	public static void main(String[] args) {
		
		int value = 0;
		
		for(int i=0;i<6;i++)
			System.out.println((int)(Math.random()*45)+1);
		
	}

}
