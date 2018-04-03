package advise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/financial_advise";
			String user = "root";
			String password = "root";

			conn = DriverManager.getConnection(url, user, password);

			System.out.println("接続成功");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pst != null) {
				try {
					pst.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		Menu.display();
		int selectedNumber = Menu.input();

		AbstractClient horikawa = null;
		ClientPool clientPool = ClientPool.getInstance();
		if (selectedNumber == 1) {
			// Client作成
			horikawa = new Client("堀川", 25, "男");
			clientPool.setClient(horikawa.getId(), horikawa);
			System.out.println("2 アドバイザー作成　に進む場合は、2を入力して下さい。");
			Scanner scanner = new Scanner(System.in);
			selectedNumber = scanner.nextInt();
			scanner.close();
		}
		Adviser adviser = null;
		if (selectedNumber == 2) {
			// いなければ、新たなAdviserを作成
			adviser = new Adviser();
			System.out.println("3 アドバイザーアサイン　に進む場合は、3を入力して下さい。");
			Scanner scanner = new Scanner(System.in);
			selectedNumber = scanner.nextInt();
			scanner.close();
		}
		if (selectedNumber == 3) {
			// listに追加するときに、作成したClientのidとClient自身を格納
			Map<Integer, AbstractClient> clientMap = clientPool.getClientMap();

			for (Integer id : clientMap.keySet()) {
				AbstractClient abstractClient = clientMap.get(id);
				System.out.println(id + " : " + abstractClient.name);
			}
			System.out.println(clientPool.getClientMap());
			adviser.getManageAdvise().setClient(1, horikawa);
		}

		// ヒアリング開始 要検討
		// ヒアリングテンプレートを使って、クライアントに入力要求
		// Hearing hearing = new Hearing();
		// ClientにHearing内容を入力してもらう

		// クライアント入力

		// QA開始
		QA qa = new QA();
		// アドバイザー質問
		qa.setQuestion("あなたは投資をしたことがありますか？");
		// クライアント返答
		qa.setAnswer("ありません。");

		// Adviseを作成、ClientとAdviserを入れる
		Advise advise = new Advise();
		List<QA> qaList = new ArrayList<>();
		qaList.add(qa);
		advise.setQaList(qaList);

		// 最初の面談はこれで終了

	}
}