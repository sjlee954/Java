
public class Ex04 {

	public static void main(String[] args) {
		int[] ball = new int[45];
		
		for (int i=0;i<ball.length;i++) {
			ball[i]=i+1;
			System.out.print(ball[i]);
		}
		System.out.println();
		
		int j=0;
		int tmp=0;
		
		for (int i=0;i<6;i++) {
			j = (int)((Math.random()*45)+1);
			tmp = ball[i];
			ball[i]= j;
			j=tmp;
		}
		for (int i=0;i<6;i++)
			System.out.printf("ball[%d]=%d%n",i,ball[i]);
		
	}

}
