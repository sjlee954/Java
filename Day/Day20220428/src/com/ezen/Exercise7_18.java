package com.ezen;

//import com.ezen.Robot.DanceRobot;
//import com.ezen.Robot.DrawRobot;
//import com.ezen.Robot.SingRobot;

public class Exercise7_18 {
	static void action(Robot r) { //static main 에서 action 메서드를 호출하기 위해선 메서드도 static메서드여야함.
		if(r instanceof DanceRobot) {
			((DanceRobot) r).dance();
		} else if(r instanceof SingRobot) {
			((SingRobot)r).sing();
		} else if(r instanceof DrawRobot) {
			((DrawRobot) r).draw();
		}
	}
	
	public static void main(String[] args) {
		//Exercise7_18 ex = new Exercise7_18();
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i=0;i<arr.length;i++)
			action(arr[i]);
		
	     
	} //main
	
}
class Robot{
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}