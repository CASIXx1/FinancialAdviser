package stock;

import java.util.ArrayList;
import java.util.List;

public class Adviser {
	private Analizable analysis;
	private List<ClientInterface> clientList = new ArrayList<>();

	//コンストラクタかセッターで具象クラスを入れる。依存性注入
}
