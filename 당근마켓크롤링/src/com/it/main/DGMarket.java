package com.it.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.it.dao.DataDAO;
import com.it.dao.SeoulLocationVO;
import com.it.dao.DGVO;

public class DGMarket {

	public static void main(String[] args) {
        DGMarket dg = new DGMarket();

        dg.DGmarket();
	}
	
	public void DGmarket()
	{
		DataDAO dao=new DataDAO();
		try
		{
			int k=1;
			for(int i=1;i<=35;i++)
			{
			   Document doc=Jsoup.connect("https://www.daangn.com/hot_articles").get();
			   Elements title=doc.select("article.card-top a.card-link div.card-desc h2.card-title");
			   Elements content=doc.select("article.card-top a.card-link div.card-desc h2.card-title");
			   Elements price=doc.select("article.card-top a.card-link div.card-desc h2.card-price");
			   Elements address=doc.select("article.card-top a.card-link div.card-desc h2.card-region-name");
			   Elements heart=doc.select("article.card-top a.card-link div.card-desc h2.card-counts");
//			   Elements link=doc.select("ul.article-list li.item a");
			   for(int j=0;j<poster.size();j++)
			   {
				   try{
					   System.out.println("번호:"+k);
					   System.out.println(title.get(j).text());
					   System.out.println(poster.get(j).attr("style"));
					   System.out.println(comment.get(j).text());
					   System.out.println(link.get(j).attr("href"));
					   Document doc2=Jsoup.connect("https://korean.visitseoul.net"+link.get(j).attr("href")).get();
					   Element address=doc2.select("div.detail-map-infor:eq(1) dl dd").get(0);
					   System.out.println("주소:"+address.text());
					   System.out.println("=========================================================");
				       
					   DGVO vo=new DGVO();
					   vo.setNo(k);
					   vo.setTitle(title.get(j).text());
					   vo.setMsg(comment.get(j).text());
					   String image=poster.get(j).attr("style");
					   image=image.substring(image.indexOf("(")+1,image.lastIndexOf(")"));
					   // style="background-image:url(/comm/getImage?srvcId=POST&amp;parentSn=5548&amp;fileTy=POSTTHUMB&amp;fileNo=1&amp;thumbTy=M)"
					   image="https://korean.visitseoul.net"+image;
					   vo.setPoster(image);
					   vo.setAddress(address.text());
					   dao.seoulLocationInsert(vo);
					   k++;
				   }catch(Exception ex) {}
			   }
			}
		}catch(Exception ex){}
	}
}