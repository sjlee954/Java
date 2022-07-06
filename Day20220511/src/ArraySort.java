import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		
		Person[] person = new Person[3];
		
		person[0]= new Person("CC",28);		
		person[1]= new Person("A",50);		
		person[2]= new Person("BBB",40);		
		
		Arrays.sort(person);
		
//		for(int i=0;i<p.length;i++)
		for(Person p : person)	
			System.out.println(p);
		
	}

}
class Person implements Comparable {
	private String name;
	private int age;
	
	
	public Person() {	}
	public Person(String name, int age) {
		this.name= name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
//	@Override
//	public int compareTo(Object o) {
//		Person p = (Person)o;
//		
////		if(this.age> p.age ) return -1;
////		else if (this.age<p.age) return 1;
////		else 
////		return 0;
//		
//		return this.age -p.age; //오름차순
////		return p.age -this.age; //내림차순
	
		@Override
		public int compareTo(Object o) {
			Person p = (Person)o;
			
			
			
			return this.name.length() -p.name.length(); //오름차순
//			return p.name.length() -this.name.length(); //내림차순
	}
	 
	
	
	
}