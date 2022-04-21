import java.util.Arrays;

public class Ex08 { //p.194 5-3

	public static void main(String[] args) {
		
		double[] dArr = new double[10];
		
		
		for(int i=0;i<dArr.length;i++) {
			dArr[i]=(double)(Math.random());
		}
				
		for (int i =0; i<dArr.length; i++) 
			System.out.printf("%.2f\n",dArr[i]);
		
		double[] tmp = new double[dArr.length*2];
		
		for(int i =0; i<dArr.length;i++) 
			tmp[i] = dArr[i];
		
		dArr = tmp;
		System.out.println("---------------------");
		for (int i =0; i<dArr.length; i++) 
			System.out.printf("%.2f\n",dArr[i]);
		
		
		
		
	}

}
