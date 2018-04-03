package advise;

import java.util.ArrayList;
import java.util.List;

public class Templete {
	public void start() {
		//一番初めに実行されるメソッド
		//Client作成 idを1と仮定
		AbstractClient horikawa = new Client("堀川", 25, "男");

		//（保留）余力のあるAdviserがいたら、その人に指定
	//	private List<Adviser> advisers;

		//いなければ、新たなAdviserを作成
		Adviser adviser = new Adviser();
		//listに追加するときに、作成したClientのidとClient自身を格納
		adviser.setClient(1, horikawa);

		//ヒアリング開始　要検討
		//ヒアリングテンプレートを使って、クライアントに入力要求
//		Hearing hearing = new Hearing();
		//ClientにHearing内容を入力してもらう

		//クライアント入力

		//QA開始
		QA qa = new QA();
		//アドバイザー質問
		qa.setQuestion("あなたは投資をしたことがありますか？");
		//クライアント返答
		qa.setAnswer("ありません。");

		//Adviseを作成、ClientとAdviserを入れる
		Advise advise = new Advise();
		List<QA> qaList = new ArrayList<>();
		qaList.add(qa);
		advise.setQaList(qaList);

		//最初の面談はこれで終了
	}
}
