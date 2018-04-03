package asset;

import java.util.Date;

import advise.Company;

//一株当りの情報
public class Stock implements Asset{
	private Company company;
	private int price;
	private Date date;
	private String name;
	//高配当か割安かなど株のレベル
	private StockLevel level;
}
