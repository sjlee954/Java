package com.ezen.market.OEM;

import java.io.File;
import java.sql.Date;

import lombok.Data;

/*
create table marketboard(
    num number,
    id varchar2(30) primary key,
    pass varchar2(40) not null,
    name varchar2(20) not null,
    title varchar2(100) not null,
    price number not null,
    content varchar2(2000) not null,
    image varchar2(500), -- �긽�뭹 �궗吏�
    bdate date, -- 湲� �옉�꽦 �씪�옄
    count number,
    heart number -- 李쒗븯湲�
);
 */
@Data
public class OEMarketBoardVO {
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public File getImage() {
		return image;
	}
	public void setImage(File image) {
		this.image = image;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getHeart() {
		return heart;
	}
	public void setHeart(int heart) {
		this.heart = heart;
	}
	private int num;
	private String id;
	private String pass;
	private String name;
	private String title;
	private int price;
	private String content;
	private File image;
	private Date bdate;
	private int count;
	private int heart;
}
