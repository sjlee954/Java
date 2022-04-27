import lombok.Getter;
import lombok.Setter;

class Exercise6_7 {
	public static void main(String[] args) {
		
		Student1 s = new Student1("손흥민",1,10,90,100,60); //생성자 호출 >>디폴드생성자
		System.out.println(s.getName());
		System.out.println(s.getTotal());
		
		Student1 s2 = new Student1("박지성",2,15,50,100,60); //생성자 호출 >>디폴드생성자
		System.out.println(s2.getName());
		System.out.println(s2.getTotal());
		
		Student1 s3 = new Student1("메시",2,15); //생성자 호출 >>디폴드생성자
		System.out.println(s3.getName());
		System.out.println(s3.getTotal());
		
		
	}
}


@Getter //@ ==> 어노테이션
@Setter

class Student1 {
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	//함수 오버로딩 : 매개변수 개수가 다른것을 오버로딩이라고 함.
	public Student1(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	//함수 오버로딩 : 매개변수 개수가 다른것을 오버로딩이라고 함.
	public Student1(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		
	}
	
	int getTotal() {
		return kor + eng + math;
	}

	double getAverage() {
		return (int)((getTotal()/3.0+0.05)*10)/10.0;
	}
	
}
