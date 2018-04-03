package advise;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Advise {
	private int id;
	private Adviser adviser;
	private AbstractClient abstractClient;
	// 最初は空のAdviseからスタートし、ヒアリングを重ねて、十分な情報が揃ったら、Adviseを完成させる
	private List<QA> qaList = new ArrayList<>();
	// QA完了日
	private Date date;
	// アドバイス〆切日
	private Date deadline;
	// アドバイスのタイトル（どういうアドバイスが欲しいか）
	private String title;
	// アドバイス内容
	private String text;
	// 完了かどうか
	private Status status;

	public Advise() {
	}

	public void start() {
		while (true) {
			// QA開始
			qaFlow();

			// QAstatusに完了かどうか入力してもらったと仮定
			// QAが完了した時刻でdateを入れて、その一ヶ月後に〆切を設定
			if (this.status == Status.QACOMPLETED) {
				Date today = new Date();
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(today);
				this.date = calendar.getTime();
				calendar.add(Calendar.MONTH, 1);
				this.deadline = calendar.getTime();
				break;
			}
		}
	}

	//画面呼び出し
	public void complete() {
		//アドバイス内容を入れる
		this.adviser.setAdvise(this);
	}

	public void qaFlow() {
		QA qa = new QA();
		// アドバイザー質問

		this.adviser.setQuestion(qa);
		this.abstractClient.setAnswer(qa);

		this.qaList.add(qa);

		//ここでadviserの判断を仰ぐ
		this.adviser.judgeQAFlow(this);
	}

	public void notifyObserver() {

	}

	public List<QA> getQaList() {
		return qaList;
	}

	public void setQaList(List<QA> qaList) {
		this.qaList = qaList;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
		this.notifyObserver();
	}

}
