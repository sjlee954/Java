package com.ezen.ex01;


public class ShollowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		Rectangle org = new Rectangle(1, 1, 8, 8);
		Rectangle cpy;
		
		cpy = (Rectangle)org.clone();
		org.showPosition();
		cpy.showPosition();
	 
		org.changePos(3, 3, 7, 7);
		org.showPosition();
		cpy.showPosition();
	}

}
class Rectangle implements Cloneable{
	private Point uppLeft;  //좌측상단 좌표
	private Point lowerRight;  //우측 하단 좌표
	
	public Rectangle(int x1,int y1,int x2,int y2) {
		uppLeft = new Point(x1,y1);
		lowerRight = new Point(x2,y2);
	}
	
	public void changePos(int x1, int y1, int x2, int y2) { //좌표 수정
		uppLeft.changePos(x1, y1);
		lowerRight.changePos(x2, y2);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public void showPosition() {   //사각형 좌표 출력
		System.out.println("좌측 상단");
		uppLeft.ShowPositon();
		System.out.println("우측 하단");
		lowerRight.ShowPositon();
	}

}
class Point implements Cloneable{
	private int xPos;
	private int yPos;
	
	public Point() {
	}
	public Point(int x, int y) {
		xPos = x; yPos = y;
	}
	
	public void changePos(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public void ShowPositon() {
		System.out.println("["+xPos+","+ yPos + "]"); //[x,y]
//		System.out.printf("[%d,%d]%n",xPos,yPos); //[x,y]
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}