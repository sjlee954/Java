
public class Ex01 { //한글 xx hangel xx

	public static void main(String[] args) {

		int bus = 1500;
		int age = (int)(Math.random()*100);
		
		System.out.println("����: "+ age);
		
		double dc=0;
		
		if (0<=  age && age<=3 || age >=65) {
			dc = bus*0;
		} else if ( 4<= age && age<=13) {
			dc = bus*0.5;
		} else if ( 14<= age && age<=19) {
			dc = bus*0.75;
		} else if ( 20<= age) {
			dc = bus;
		}
		System.out.println("���� �� ����: "+ (int)dc + "��");
		
		
	}

}
