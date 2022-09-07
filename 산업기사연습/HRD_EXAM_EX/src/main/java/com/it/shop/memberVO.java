package com.it.shop;

/*create table member_tbl_02 ( 
custno number(6), -- 회원 번호
custname varchar2(20), -- 이름
phone varchar2(13), -- 연락처
address varchar2(60), -- 주소
joindate date, -- 등록일
grade char(1), city char(2), -- 등급, 거주지
primary key(custno) -- 기본키
);

create table money_tbl_02 ( 
custno number(6), -- 고객번호
salenol number(8), -- 판매번호
pcost number(8), -- 단가
amount number(4), -- 수량
price number(8), -- 가격
pcode varchar2(4), -- 상품코드
sdate date, -- 판매일자
primary key(custno, salenol) ); --기본키
*/

public class memberVO {
	private int custno, salenol, pcost, amount, price;
	private String custname, phone, address, grade, city, joindate,pcode,date;
	public int getCustno() {
		return custno;
	}
	public void setCustno(int custno) {
		this.custno = custno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getJoindate() {
		return joindate;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	public int getSalenol() {
		return salenol;
	}
	public void setSalenol(int salenol) {
		this.salenol = salenol;
	}
	public int getPcost() {
		return pcost;
	}
	public void setPcost(int pcost) {
		this.pcost = pcost;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}
