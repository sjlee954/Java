package com.ezen.mybatis;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardVO {
	private int id;
	private String name;
	private String phone;
	private String address;
}
