package com.it.enroll;

public class classVO {
	/*
	 *     class_seq number(4) not null,
    regist_month char(8) not null,
    c_no char(5) not null,
    class_area varchar2(15),
    tution number(8),
    teacher_code char(3),
    primary KEY (regist_month, c_no)
	 * */
	
	private int class_seq,tution;
	private String regist_month,c_no,class_area,teacher_code,teacher_name,class_name;
	
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public int getClass_seq() {
		return class_seq;
	}
	public void setClass_seq(int class_seq) {
		this.class_seq = class_seq;
	}
	public String getRegist_month() {
		return regist_month;
	}
	public void setRegist_month(String regist_month) {
		this.regist_month = regist_month;
	}
	public String getC_no() {
		return c_no;
	}
	public void setC_no(String c_no) {
		this.c_no = c_no;
	}
	public String getClass_area() {
		return class_area;
	}
	public void setClass_area(String class_area) {
		this.class_area = class_area;
	}
	public int getTution() {
		return tution;
	}
	public void setTution(int tution) {
		this.tution = tution;
	}
	public String getTeacher_code() {
		return teacher_code;
	}
	public void setTeacher_code(String teacher_code) {
		this.teacher_code = teacher_code;
	}
	
}
