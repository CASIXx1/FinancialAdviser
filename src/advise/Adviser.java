package advise;

public class Adviser {
	private Analizable analysis;
	private ManageAdvise manageAdvise;

	//コンストラクタかセッターで具象クラスを入れる。依存性注入
	public Adviser() {
		//クライアントリスト格納
		//evalClientLevelメソッド呼び出し
	}

	// アドバイザー質問
	public void setQuestion(QA qa) {
		//質問の設定
		//仮
		qa.setQuestion("あなたは投資をしたことがありますか？");
	}

	public void judgeQAFlow(Advise advise) {
		//if文で完了にするかどうか判断するように
		//仮
		advise.setStatus(Status.QACOMPLETED);
	}

	public void setAdvise(Advise advise) {
		//仮
		advise.setText("アドバイスしました！");
	}

	public ManageAdvise getManageAdvise() {
		return manageAdvise;
	}

	public void setManageAdvise(ManageAdvise manageAdvise) {
		this.manageAdvise = manageAdvise;
	}
}
