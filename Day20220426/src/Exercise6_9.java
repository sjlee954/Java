import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

class Exercise6_9 {
	public static void main(String[] args) {
		
		Student11 s = new Student11("ȫ�浿",1,1,100,60,76);
		
		System.out.println(s.info());
		System.out.println(s.toString());
	}
}

@Getter
@Setter
@ToString
class Student11 {
	
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
	
	Student11() {}
	Student11(String name,int ban, int no,int kor,int eng,int math) {
		this.name = name;
		this.ban = ban;
		this.no= no;
		this.kor=kor;
		this.eng = eng;
		this.math = math;
	}
	
	 String info() {
		return name +","+ ban +","+ no +","
	           + kor +","+ eng +","+ math
	           +","+ getTotal() +","+ getAverage();
			}

}
