package advise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManageAdvise {
	//idでclientを指定
	//持てるclient数の限界値は決めておく（5個のクライアントしか持てない）
	private Map<Integer, AbstractClient> clientList = new HashMap<>();

	Map<Integer, V>
	public void setClient(Integer key, AbstractClient value) {
		this.clientList.put(key, value);
	}

	private ClientLevel setClientLevel() {
		//Analizableを経由し、クライアントレベルを返す
		return null;
	}

	private int checkClientNum() {
		//AdviseのclientListの個数を返す
		return this.clientList.size();
	}

	//特定のクライアントのadviseを出力
	private void displayAdvise(Integer key) {
		AbstractClient abstractClient = this.clientList.get(key);
		List<Advise> advises = abstractClient.getAdviseList();
		for (Advise advise : advises) {
			System.out.println(advise.getTitle());
			System.out.println(advise.getStatus());
			if(advise.getStatus() == Status.STARTED) {
				advise.start();
			}
		}
	}

	//ClientがもっているAdviseのidを取得するメソッド

	//ステータス管理をするメソッド
}
