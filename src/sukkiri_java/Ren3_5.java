package sukkiri_java;

public class Ren3_5 {
	public static void main(String[] args) {
		System.out.println("［メニュー］１：検索 ２：登録 ３：削除 ４：変更＞");
		for(String flg = "NG"; flg.equals("NG");) {
			int selected = new java.util.Scanner(System.in).nextInt();
			vew(selected);
		}
	}
	
	public static String vew(int selected) {
		int sel = selected;
		switch (sel) {
		case 1: System.out.println("検索します");			
			return "OK";
		case 2: System.out.println("登録します");
			return "OK";
		case 3: System.out.println("削除します");
			return "OK";
		case 4: System.out.println("変更します");
			return "OK";
		default: System.out.println("もう一度入力してください");
			return "NG";
		}
	}
}
