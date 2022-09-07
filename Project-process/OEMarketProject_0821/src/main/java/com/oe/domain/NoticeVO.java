package com.oe.domain;

import java.util.Date;

import lombok.Data;

/*
--고객센터 (자주 하는 질문, 공지사항 / 관리자 게시물)
CREATE TABLE NOTICE (
   no_num NUMBER PRIMARY KEY, --글번호
   no_id VARCHAR2(30) NOT NULL,
   no_nickname varchar2(30) not null,
   no_title VARCHAR2(300) NOT NULL,
   no_content VARCHAR2(3000) NOT NULL,
   no_category VARCHAR2(30), --FAQ : 자주 하는 질문, NOTICE : 공지사항
   no_readcount NUMBER DEFAULT 0, --조회수
   no_date DATE DEFAULT SYSDATE,
   no_deldate DATE DEFAULT SYSDATE,
   no_del VARCHAR(1) DEFAULT '0', -- 0: 미삭제 1:삭제 
   CONSTRAINT fk_notice_id FOREIGN KEY (no_id) REFERENCES MARKETUSER (us_id)
   ON DELETE CASCADE
);
*/

@Data
public class NoticeVO {
	private Integer no_num;
	private String no_id;
	private String no_nickname;
	private String no_title;
	private String no_content;
	private String no_category;
	private Integer no_readcount;
	private Date no_date;
	private Date no_deldate;
	private String no_del;
}
