package sukkiri_java;

public class Ren3_6 {
	public static void main(String[] args) {
		System.out.println("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(10);
		for(int i = 0; i < 5; i++) {
			int num = new java.util.Scanner(System.in).nextInt();
			if(num == ans) {
				System.out.println("アタリ！");
				break;
			} else {
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");
	}
}
