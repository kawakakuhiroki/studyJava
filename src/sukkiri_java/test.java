package sukkiri_java;

public class test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 30;
		String str = String.valueOf(a);
		System.out.println(str);
		int jknCom = 0;
		do {
			jknCom = new java.util.Random().nextInt(3) + 1;
		} while(jknCom != 1);
		if (str.equals("1")) {
			System.out.println("1です");
		}
		int ans = 1;
		int jkncom = 3;
		String henkan = String.valueOf(ans) + String.valueOf(jknCom);
	}

}
