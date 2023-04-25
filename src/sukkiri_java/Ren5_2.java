package sukkiri_java;

public class Ren5_2 {
	public static void email(String title,String address,String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	public static void email(String address,String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}
	public static void main(String[] args) {
		email("XXXの件について", "kawkaku.hiroki@icloud.com", "いつもお世話になっております。\n昨日の件ですが、先方に確認したところ、問題ございませんでした。\n以上、よろしくお願いいたします。");
		System.out.println();
		email("kakkun0830@gmail.com", "こんにちは。到着しました。");
	}
}
