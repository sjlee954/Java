
public class Ex01 {

	public static void main(String[] args) {
		System.out.println("1" + "2");   // 12
		System.out.println(true + "");   //true
		System.out.println('A'+'B');    //65+66=131
		System.out.println('1'+2);     //49+2=51   int가 더 큼
		System.out.println('1'+'2');   //'1'=49  '2'=50 -->99
		System.out.println('J'+"ava");   
//		System.out.println(true + null); 오류. null은 연산자체가 안돼서 오류가 남.
	}

}
