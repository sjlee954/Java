package com.ezen01;

class StringBufferEx1 {
	
	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer("abc");
//		StringBuffer sb2 = new StringBuffer("abc");
//		System.out.println("sb==sb2 ? "+ (sb == sb2));
//		System.out.println("sb.equals(sb2)?" + sb.equals(sb2));
//		
//		//StringBuffer의 내용을 String으로 변환한다.
//		String s = sb.toString();
//		String s2 = sb2.toString();
//		System.out.println("s.equals(s2)? "+ s.equals(s2));
		
		StringBuffer sb3 = new StringBuffer("0123456");
//		sb3.delete(3, 6);
//		System.out.println(sb3);
//		sb3.deleteCharAt(0);
//		System.out.println(sb3);
		
//		sb3.insert(3,"a");
//		System.out.println(sb3);
		
//		sb3.replace(1, 4, "abcd");
//		System.out.println(sb3);
		
		sb3.reverse();
		System.out.println(sb3);
		
	}

}
