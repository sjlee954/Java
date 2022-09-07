package com.ezen.ex01;


class DBox<L,R> {
	
	private L left;
	private R right;
	
	public void set(L l, R r) {
		left=l;
		right=r;
	}
	@Override
	public String toString() {
		return left + "&"+ right;
	}

}
/*
 * class DBox<String, Integer> {
	
	private String left;
	private Integer right;
	
	public void set(String l, Integer r) {
		left=l;
		right=r;
	}
	@Override
	public String toString() {
		return left + "&"+ right;
	}

}
 */

public class MultiTypeParam {
	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<String, Integer>();
		
		box.set("Apple", 20);  //내부적으로 new Integer(20)으로 바꿔서 집어넣어줌!
		System.out.println(box);
		box.set("Apple2", new Integer(50));
		System.out.println(box);
		
//		box.set(20, "Apple"); //타입불일치로 에러남.
	}

}
