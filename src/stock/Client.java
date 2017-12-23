package stock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client implements ClientInterface{
	private List<Advise> adviseList = new ArrayList<>();
	private int id;
	private ClientLevel level;
	private int investmentYears;
	//保有資産
	private Asset assets;

	//ここら辺Clientが持つ必要ないかも
	//何年後に
	private int afterYears;
	//いくら儲けたいのか
	private int targetAmount;
	//目標年利
	private int targetAnnualInterest;
	private Map<Stock, Integer> stockNumber = new HashMap<>();
	private Map<String, Integer> stockLevelRate = new HashMap<>();
	
	public Client() {
		//ここでassetsを入れる
	}
}
