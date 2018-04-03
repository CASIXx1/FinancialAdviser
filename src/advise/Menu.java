package advise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	public static void display() {
		List<String> menuList = new ArrayList<>();
		menuList.add("1 クライアント作成");
		menuList.add("2 アドバイザー作成");
		menuList.add("3 アドバイザーアサイン");
		menuList.add("4 QA開始");
		menuList.add("5 Advise作成");

		System.out.println("どの項目にしますか？");
		for (String string : menuList) {
			System.out.println(string);
		}
	}

	public static int input() {
		Scanner scanner = new Scanner(System.in);
		int inputNumber = scanner.nextInt();
		scanner.close();
		return inputNumber;
	}

	public void get() {

	}

	public void initMenu() {

	}
}
