
public class Ex03 { //p.171 4-25 1부터 몇까지 더하면 누적합계가 100을 넘지 않는 제일 큰 수가 될까?

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while ((sum += ++i)<=100) { 
			System.out.println(i +"-"+ sum);
		}
		
	}

}
