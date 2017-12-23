package stock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Adviser {
	private Analizable analysis;
	private Map<Integer, ClientInterface> clientList = new HashMap<>();
	private 

	//コンストラクタかセッターで具象クラスを入れる。依存性注入
	public Adviser() {
		//クライアントリスト格納
		//evalClientLevelメソッド呼び出し
	}
	
	public void startHearing() {
		//基本的なヒアリングを行う
	}
	
	private ClientLevel setClientLevel() {
		//Analizableを経由し、クライアントレベルを返す
		return null;
	}
}
