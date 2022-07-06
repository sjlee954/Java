package com.naver;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class naverTest {

	public static void main(String[] args) throws IOException {
		
		int pages = 1;
		
		for(int i=0;i<pages;i++) {
			
		
			String url = "https://news.naver.com/main/list.naver?mode=LS2D&sid2=249&sid1=102&mid=shm&date=20220502&page="+i;
		
			Document doc  = Jsoup.connect(url).get(); //url소스 긁어와서 doc에 담기
//			System.out.println(doc);
			Elements elements = doc.getElementsByAttributeValue("class", "list_body newsflash_body"); //클래스는 중복이 될 수도 있기 때문에 애초에 Elments복수로 가져와야함.
			Element element = elements.get(0); 
//			System.out.println(element);
		
			Elements photoElements = element.getElementsByAttributeValue("class", "photo"); //사진
//			System.out.println(photoElements);
		 
			for(int j =0;j<photoElements.size();j++) {
			
				Element articleElement = photoElements.get(j);
//				System.out.println(articleElement);
				Elements aElements = articleElement.select("a"); //스트링배열로 가져온다 복수에 담아야한다.
				Element aElement = aElements.get(0);
//				System.out.println(aElements);
			
			String newsUrl = aElement.attr("href"); //기사 링크
//			System.out.println(newsUrl);
			Element imgElement = aElement.select("img").get(0);
			String imgUrl = imgElement.attr("src");
//			System.out.println(imgUrl);  //사진만
			String title = imgElement.attr("alt"); //기사 제목
//			System.out.println(title);
			
				Document detailDoc = Jsoup.connect(newsUrl).get(); // 싹 다 긁어와서 doc에 넣기
				Element contentElement = detailDoc.getElementById("dic_area"); //id는 중복되지 x 단수타입에 담아준다.
				String content = contentElement.text();
			
				System.out.println(title); //제목
				System.out.println(content); //내용
				System.out.println(); //줄바꿈
			//insert메서드 추가해보면 어떨까??
		}
	}
	}
}
