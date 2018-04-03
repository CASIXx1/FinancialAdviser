package advise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import asset.AssetManage;
import asset.Stock;

public abstract class AbstractClient {
	private List<Advise> adviseList = new ArrayList<>();
	private int id;
//	private ClientLevel level;
	private int investmentYears;
	//保有資産
	private AssetManage assetsManage;
	private ClientStatus clientStatus;

	//ここら辺Clientが持つ必要ないかも
	//何年後に
	private int afterYears;
	//いくら儲けたいのか
	private int targetAmount;
	//目標年利
	private int targetAnnualInterest;
	private Map<Stock, Integer> stockNumber = new HashMap<>();
	private Map<String, Integer> stockLevelRate = new HashMap<>();

	public int getId() {
		return this.id;
	}

	public String getName() {
		return name;
	}

	public List<Advise> getAdviseList() {
		return this.adviseList;
	}

	public void setAnswer(QA qa) {}
}
