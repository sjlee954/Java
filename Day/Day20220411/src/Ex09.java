
public class Ex09 { //È¦¼öÀÇ ÇÕ

	public static void main(String[] args) {
		int sum = 0;
		int i=1;
				
		for (i=1;i<=10;i++) {
			if(sum > 100)
			if(i%2==1)
				continue;
			sum += i;
		}
		System.out.println("È¸ÀüÈ½¼ö: "+i+","+"sum: "+sum);

	}

}
