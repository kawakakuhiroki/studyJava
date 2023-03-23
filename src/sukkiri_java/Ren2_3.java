package sukkiri_java;

public class Ren2_3 {

	public static void main(String[] args) {
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		fortune++;
		String result = null;
		switch (fortune) {
		case 1: result = "大吉";
		break;
		case 2: result = "中吉";
		break;
		case 3: result = "吉";
		break;
		case 4: result = "凶";
		break;
		}
		System.out.println("占いの結果がでました！");
		System.out.println(age + "歳の" + name + "さん、あなたの運勢は" + result + "です");
	}

}
