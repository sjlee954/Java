package com.oe.domain;

import java.util.Date;

import lombok.Data;

/*
--게시물 댓글
create table reply(
re_num number not null,
bo_num number not null,
re_reply varchar2(1000) not null,
re_name varchar2(50) not null,
re_regdate date default sysdate,
re_updateDate date default sysdate,
re_profile varchar2(4000),
CONSTRAINT fk_re_num FOREIGN key(bo_num) REFERENCES marketboard(bo_num)on delete cascade);

 * */
@Data
public class ReplyVO {

	private Long re_num, bo_num;
	private String re_reply, re_name, re_profile;
	private Date re_regdate, re_updateDate;
	
}
