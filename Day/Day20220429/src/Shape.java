
abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point(0,0));
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea(); //도형의 면적을 계산해서 반환하는 메서드
	
	Point getPosition() {
		return p;
	}	
		
	void setPosition(Point p) {
		this.p= p;
	}
	
}
class Circle extends Shape {
	double r;
	
	public Circle() {} //디폴트 생성자
    
	//Shape s3 = new Circle(5);
	public Circle(double r) {
//		super(new Point(0,0)); 굳이x
		this.r =r;
	} 
	
	//Shape s2 = new Circle(new Point(10,10),5);
	public Circle(Point p, double r) {
		super(p);
		this.r = r;
	}
	
	@Override
	double calcArea() {
		double result = r*r*Math.PI; 
		return result;
		//return Math.PI*r*r; 이렇게 해도됨.!
	}
	
}
class Rectangle extends Shape {
	double width;
	double height;
	
	public Rectangle() {
		this(new Point(0,0),0,0);
	} //디폴트생성자
	
	public Rectangle(double width, double height) {
//		this.width = width;
//		this.height = height;
		this(new Point(0,0),width,height);
		
	
	}
	//Shape r3 = new Rectangle(new Point(100,100)150,50);
	public Rectangle(Point p, double width, double height) {
		super(p);
		this.width = width;
		this.height = height;
	}
	
	boolean isSquare() {
		if(width == height && width*height !=0) {
			return true;
		}
		return false;
	}
	
	@Override
	double calcArea() {
		double result = width*height;
		return result;
	}
}

class Point {
	int x;
	int y;
	
	Point() { //디폴트 생성자
		this(0,0);
	}
	
	Point(int x, int y) { //매개변수 있는 생성자
		this.x = x;
		this.y= y;
	}
	
	public String toString() {
		return "["+x+","+y+"]";
	}

	public static void main(String[] args) {
		Shape s = new Circle();
		Shape s2 = new Circle(new Point(10,10),5);
		Shape s3 = new Circle(5);
		System.out.println((int)s2.calcArea());
		
		Shape r = new Rectangle();
		Shape r2 = new Rectangle(150,50);
		Shape r3 = new Rectangle(new Point(100,100),150,50);
		System.out.println(r3.calcArea());
	}
}

