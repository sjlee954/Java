import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
//사용자가 만든 클래스를 통해서 해쉬셋에 데이터를 넣게되면 중복된 데이터를 걸러주지 못한다.
//해쉬코드와 이퀄스메서드를 적절하게 오버라이딩해서 직접 걸러줘야한다.


class Car2 {
	private String model;
	private String color;
	private char c;
	public Car2(String model, String color) {
		this.model = model;
		this.color = color;
	}
	public Car2(char c) {
		this.c = c;}
	
	@Override
	public String toString() {
		return model+", " +color;
	}
	@Override
	public int hashCode() {
		return Objects.hash(model,color);
	}
//	@Override
//	public boolean equals(Object obj) {
//		if(this.model == ((Car2)obj).model && this.color == ((Car2)obj).color)
//			return true;
//		else return false;
//	}
	@Override
	public boolean equals(Object obj) {
		String m = ((Car2)obj).model;
		String c = ((Car2)obj).color;
		
		if(model.equals(m) && color.equals(c))
			return true;
		else return false;
	} // return (model.equals(m) && color.equals(c)) ? true : false;
}


public class HashSetEx3 {

	public static void main(String[] args) {
		
		
		Set<Character> set = new HashSet<Character>(); //중복된 데이터는 저장자체가 안됨.
		
		set.add('A');
//		set.add(new Car2("Y201","red"));
//		set.add(new Car2("Y202","black"));
//		set.add(new Car2("Y201","red"));
//		set.add(new Car2("Y201","white"));
//		set.add(new Car2("Y203","black"));
	
		System.out.println("cnt : "+set.size()); 
		
		for(Iterator<Character> itr = set.iterator(); itr.hasNext();) {
			System.out.print(itr.next()+"\t");
		}
		System.out.println();
		
//		for(Car2 s : set)
//			System.out.print(s+"\t");
		
	}

}
