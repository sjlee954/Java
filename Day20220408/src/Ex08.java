
public class Ex08 { //1+(-2)+3+(-4)+...과 같은식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.

	public static void main(String[] args) {
		int sum = 0;
		int i=0;
		int sign =1;
		int tmp;
		
		for(i=1;true;i++,sign=-sign) { //sign = 1,-1,1,-1,1,-1.....
			tmp = i*sign;
			//System.out.println(tmp);
			sum += tmp;
			if(sum>=100)
				break;
		
	}
		System.out.println("i:"+i+" tmp:"+tmp+" sum:"+sum);
}

}