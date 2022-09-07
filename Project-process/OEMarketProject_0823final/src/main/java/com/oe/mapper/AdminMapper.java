package com.oe.mapper;

import java.util.List;

import com.oe.domain.MarketBoardVO;
import com.oe.domain.MarketUserVO;
import com.oe.domain.MyPageVO;

public interface AdminMapper {

	
	public List<MarketUserVO> readUserList();
//	public List<MarketUserVO> readUserList2(String user_id);
	public List<MarketBoardVO> readBoardList();
	public List<MarketUserVO> getUserId();
	
}
