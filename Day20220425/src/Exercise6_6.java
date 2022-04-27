import lombok.Getter;
import lombok.Setter;

class Exercise6_6 {
	public static void main(String[] args) {
		
		Student3 s1 = new Student3();
		
		System.out.println("---------------------");
		
		Student3 s2 = new Student3();
//		System.out.println("총점 : " + s2.getTotal());
//		System.out.println("평균 : " + s2.getAverage());
		
		System.out.println("----------------------");
		
		Student3 s3 = new Student3();
		
		s3.getAverage();
		String name = s3.getName();
		s3.setName("홍길동");
		System.out.println(s3.getName());
		s3.setKor(90);
		int kor = s3.getKor(); //둘다 가능
		System.out.println(s3.getKor()); //둘다 가능
		s3.setBan(5);
		System.out.println(s3.getBan());
		
	}

}

//private < default < protected < public

@Getter //@ ==> 어노테이션
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