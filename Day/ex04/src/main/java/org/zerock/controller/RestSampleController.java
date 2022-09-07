package org.zerock.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.SampleVO;
import org.zerock.domain.Ticket;

import lombok.extern.log4j.Log4j;

//@Controller 일반컨트롤러 쓰게되면 데이터가 클라이언트 화면에 안날라감 
@RestController //@Controller + ResponseBody
@RequestMapping("/sample")
@Log4j
public class RestSampleController {
									//반환형
//	@GetMapping(value="/getText", produces="text/plain; charset=utf-8")
	@GetMapping(value="/getText", produces = {MediaType.TEXT_PLAIN_VALUE})
//	@ResponseBody
	public String getText() {
		log.info("MINY TYPE : " + MediaType.TEXT_PLAIN_VALUE);
		return "안녕하세요";
	}
	
	//객체반환
	@GetMapping(value="/getSample", produces= {
//			MediaType.APPLICATION_JSON_UTF8_VALUE,
			//반환타입들 ->json, xml
			MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE
	})
//	@ResponseBody
	public SampleVO getSample() {
		//1개의 데이터 보냄
		return new SampleVO(111, "홍", "길동");
	}
	
	@GetMapping(value="/getList", produces= {
			MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE	})
	
	//클래스에 @Controller쓸거면 메서드에는 @ResponseBody해줘야함.!
	public List<SampleVO> getList(){
//		List<SampleVO> list = new ArrayList<>();
//		SampleVO vo = new SampleVO();
//		vo.setMno(000);
//		vo.setFirstName("박");
//		vo.setLastName("찬호");
//		list.add(vo);
//
//		SampleVO vo2 = new SampleVO();
//		vo2.setMno(111);
//		vo2.setFirstName("김");
//		vo2.setLastName("연아");
//		list.add(vo2);
//		
//		SampleVO vo3 = new SampleVO();
//		vo3.setMno(222);
//		vo3.setFirstName("홍");
//		vo3.setLastName("진호");
//		list.add(vo3);
//		
//		return list;
		return IntStream.range(1, 5).mapToObj(i->new SampleVO(i,i+"FirstName",i+"LastName"))
				.collect(Collectors.toList());
	}
	
	@GetMapping(value="/getMap", produces = {
			MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE
	})
	public Map<String, SampleVO> getMap(){
		Map<String, SampleVO> map = new HashMap<>();
		map.put("First", new SampleVO(111, "수원", "이젠"));
		map.put("Second", new SampleVO(222, "경기", "팔달구"));
		return map;
	}
	
	//싱태 코드도 함께 전송. HttpStatus.BAD_GATEWAY(502), HttpStatus.OK(200)
	@GetMapping(value="/check", params= {"height", "weight"})
	public ResponseEntity<SampleVO> check(Double height, Double weight){
		SampleVO vo = new SampleVO(1, " "+ height, " " + weight);
		ResponseEntity<SampleVO> result = null;
		
		if(height < 150) {
			result = ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(vo);
		}else {
//			result = ResponseEntity.status(HttpStatus.OK).body(vo); 같은 형태지만 아래가 좀 더 적절
			result = new ResponseEntity<SampleVO>(vo, HttpStatus.OK);
		}
		return result;
	}
	
	@GetMapping(value = "/product/{cat}/{pid}")
	public String[] getPath(
			//배열형태로 반환시키고 있음. 
			@PathVariable("cat") String cat, 
			@PathVariable("pid") String pid
			) {
		return new String[] { "category : " + cat, "productid : " + pid };
	}
	
	@PostMapping("/ticket") //@RequestBody json타입을 객체로 받을 수 있게 해줌.
	public Ticket convert(@RequestBody Ticket ticket) {
		log.info("convert : " + ticket);
		return ticket;
	}
}