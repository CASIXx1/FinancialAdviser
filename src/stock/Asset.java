package stock;

public class Asset {
	//現金
	private int cash;
	//不動産
	private int estate;
	//株
	private int stock;
	
	public Asset(int cash, int estate, int stock) {
		
	}
	
	private int getSumAssets() {
		//合計保有資産額を返す
		return cash + estate + stock;
	}
}
