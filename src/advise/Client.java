package advise;

public class Client extends AbstractClient{
	private ClientLevel level;
	private int id;
	protected String name;
	private int age;
	private String gender;

	public Client(String name, int age, String gender) {
		//初期画面でid以外の情報を全て入力して、DBに送信
		//setterメソッド 成功したら、フィールド変数に格納
		this.name = name;
		this.age = age;
		this.gender = gender;
		id = SingletonId.getInstance().getId();
	}

	public int getId() {
		return id;
	}

	public void setHearing() {

	}

	public void setAnswer(QA qa) {
		//仮返答
		qa.setAnswer("ありません。");
	}
}
