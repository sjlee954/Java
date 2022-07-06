package com.ezen.market.OEM;

import java.io.File;
import java.sql.Date;

import lombok.Data;

/*
 create table marketuser(
 	  num number,
	  id varchar2(30) primary key,
	  pass varchar2(40) not null,
	  uname varchar2(20) not null,
	  nickname varchar2(20) UNIQUE,
	  birth char(8), -- �깮�뀈�썡�씪 (YYYYMMDD)
	  email varchar2(30) UNIQUE,
	  address varchar2(100) not null,
	  phone char(13) not null,
	  profile varchar2(500), -- �봽濡쒗븘 �궗吏�
	  udate date -- 媛��엯�씪�옄
	  admin number default 1 -- 愿�由ъ옄 0, �씪諛� �쉶�썝 1
);
 * */
@Data
public class OEMarketUserVO {
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
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public File getProfile() {
		return profile;
	}
	public void setProfile(File profile) {
		this.profile = profile;
	}
	public Date getUdate() {
		return udate;
	}
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	public int getAdmin() {
		return admin;
	}
	public void setAdmin(int admin) {
		this.admin = admin;
	}
	private int num;
	private String id;
	private String pass;
	private String uname;
	private String nickname;
	private String birth;
	private String email;
	private String address;
	private String phone;
	private File profile;
	private Date udate;
	private int admin;

}
