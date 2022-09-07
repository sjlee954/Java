import lombok.Getter;
import lombok.Setter;

class Exercise6_6 {
	public static void main(String[] args) {
		
		Student3 s1 = new Student3();
		
		System.out.println("---------------------");
		
		Student3 s2 = new Student3();
//		System.out.println("���� : " + s2.getTotal());
//		System.out.println("��� : " + s2.getAverage());
		
		System.out.println("----------------------");
		
		Student3 s3 = new Student3();
		
		s3.getAverage();
		String name = s3.getName();
		s3.setName("ȫ�浿");
		System.out.println(s3.getName());
		s3.setKor(90);
		int kor = s3.getKor(); //�Ѵ� ����
		System.out.println(s3.getKor()); //�Ѵ� ����
		s3.setBan(5);
		System.out.println(s3.getBan());
		
	}

}

//private < default < protected < public

@Getter //@ ==> ������̼�
@Setter
class Student3 {
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	

	int getTotal() {
		return kor + eng + math;
	}

	double getAverage() {
		return (int)((getTotal()/3.0+0.05)*10)/10.0;
	}
	
}
