
public class Ex06 {

	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		int count=0;
		
		do {
			
		num1 = (int)(Math.random()*6+1);
		num2 = (int)(Math.random()*6+1);
		System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
		count++;
		
		if (num1 + num2 == 5) break;
		
		} while (num1+num2 != 5);
		
		System.out.println("주사위 숫자: "+num1+","+num2);
		System.out.println("반복횟수: "+count);
	}

}

