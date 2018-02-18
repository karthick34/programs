package com.yogesh.onetoone;

import java.util.Date;

import org.hibernate.Session;

import com.yogesh.entity.Stock;
import com.yogesh.entity.StockDetail;
import com.yogesh.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Hibernate one to one (Annotation)");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Stock stock = new Stock();

//	stock.setStockId(15);
		stock.setStockCode("13");
		stock.setStockName("yogesh");

		StockDetail stockDetail = new StockDetail();
		//stockDetail.setStockId(15);
		stockDetail.setCompName("PADINI Holding Malaysia");
		stockDetail.setCompDesc("one stop shopping");
		stockDetail.setRemark("vinci vinci");
		stockDetail.setListedDate(new Date());

		stock.setStockDetail(stockDetail);
		stockDetail.setStock(stock);

		session.save(stock);
		session.getTransaction().commit();
		session.close();

		System.out.println("Done");
	}
}
