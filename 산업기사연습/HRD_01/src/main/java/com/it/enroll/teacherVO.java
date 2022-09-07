package com.it.enroll;

public class teacherVO {
	/*
	teacher_seq number(4) not null,
    teacher_code char(3) not null,
    class_name varchar2(12),
    teacher_name varchar2(12),
    class_price NUMBER(8),
    teacher_regist_date char(8),
    primary KEY (teacher_code)
	 * */
	
	private int teacher_seq, class_price;
	private String teacher_code,class_name,teacher_name,teacher_regist_date,class_area;

	public String getClass_area() {
		return class_area;
	}
	public void setClass_area(String class_area) {
		this.class_area = class_area;
	}
	public String getTeacher_code() {
		return teacher_code;
	}
	public void setTeacher_code(String teacher_code) {
		this.teacher_code = teacher_code;
	}

	public int getTeacher_seq() {
		return teacher_seq;
	}
	public void setTeacher_seq(int teacher_seq) {
		this.teacher_seq = teacher_seq;
	}
	public int getClass_price() {
		return class_price;
	}
	public void setClass_price(int class_price) {
		this.class_price = class_price;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public String getTeacher_regist_date() {
		return teacher_regist_date;
	}
	public void setTeacher_regist_date(String teacher_regist_date) {
		this.teacher_regist_date = teacher_regist_date;
	}
	
}
