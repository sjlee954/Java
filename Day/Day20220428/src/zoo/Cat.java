package zoo;

//public >> protected >> default >> private
//누구나ok       상속받음 ok   같은 패키지안에서  접근x

public class Cat {
	public void makeCat() {
		Duck quak = new Duck();
	}
}

class Duck {
	
}
