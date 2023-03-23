package sukkiri_java;

public class Code2_12 {

	public static void main(String[] args) {
		// 大きい方の数値を代入する命令
		int a = 5;
		int b = 2;
		int m = Math.max(a, b);
		System.out.println(a + "と" + b + "とで大きい方は" + m);
		// 同じ値の場合は値をそのまま返す
		int c = 100;
		int d = 100;
		int m2 = Math.max(c, d);
		System.out.println(m2);
	}

}
