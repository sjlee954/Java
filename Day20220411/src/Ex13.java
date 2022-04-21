
public class Ex13 {

	public static void main(String[] args) {
		//for문에 Loop1이라는 이름을 붙였다.
		Loop1 : for(int i=2;i<=9;i++) {
				for(int j=1;j<=9;j++) {
					if(j==5)
//						break Loop1;  //for i 끝
//						break; //for i는 반복 j는 끝
						continue Loop1; // System.out.println();를 넘어가서 for i증감식으로 들어감.
//						continue; //모든 반복문을 풀어내고 전체for문을 빠져나감.
				System.out.println(i+"*"+j+"="+i*j);
			}//end of for i
				System.out.println();
		} //end of Loop1
	}

}
