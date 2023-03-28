package sukkiri_java;


public class Janken {

	public static void main(String[] args) {
		// じゃんけんプログラム
		System.out.println("じゃんけんゲームを開始します");
		System.out.println("グーチョキパーのいづれかを入力してください");
		int ans = 0;
		do {
			String jknMe = new java.util.Scanner(System.in).nextLine();
			ans = henkan(jknMe);			
		} while(ans == 99);
		int jknCom = 0;
		do {
			jknCom = new java.util.Random().nextInt(3) + 1;
		} while(jknCom == ans);
		switch(jknCom) {
			case 1 : System.out.println("COMはグーを出しました。");
			break;
			case 2 : System.out.println("COMはチョキを出しました");
			break;
			case 3 : System.out.println("COMはパーを出しました");
			break;
		}
		String henkan = String.valueOf(ans) + String.valueOf(jknCom);
		if(henkan.equals("12")) {
			System.out.println("あなたの勝ちです");
		} else if (henkan.equals("13")) {
			System.out.println("相手の勝ちです");
		} else if (henkan.equals("21")) {
			System.out.println("相手の勝ちです");
		} else if (henkan.equals("23")) {
			System.out.println("あなたの勝ちです");
		} else if (henkan.equals("31")) {
			System.out.println("あなたの勝ちです");
		} else if (henkan.equals("32")) {
			System.out.println("相手の勝ちです");
		} else {
			System.out.println("あいこです");
		}
	}
	
	public static int henkan(String jkn) {
		if(jkn.equals("グー")) {
			return 1;
		} else if (jkn.equals("チョキ")) {
			return 2;
		} else if (jkn.equals("パー")) {
			return 3;
		} else {
			System.out.println("もう一度入力してください");
			return 99;
		}
	}

}
