
public class Ex18 {

	public static void main(String[] args) {
		//다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 
		//변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
		//단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. (1)에 알맞은 코드를 넣어 완성하시오. 
		//[Hint] 나눗셈연잔자 사용해야 한다. 
		
		int[] coinUnit = {500,100,50,10};
		int money = 2680;
		System.out.println("money= "+money);
		
		int[] num = new int[4]; //동전 분류할 새로운 방 만들기

		for (int i=0; i<coinUnit.length;i++) {

			num[i] = money/coinUnit[i]; 
			money = money%coinUnit[i];
			
			System.out.println(coinUnit[i]+"원 개수: " +num[i]);
		
		}


	}

}
