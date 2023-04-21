package sukkiri_java;

public class Code5_10 {
	// １つ目のaddメソッド
	public static int add(int x, int y) {
		return x + y;
	}
	// ２つ目のメソッド
	public static double add(double x, double y) {
		return x + y;
	}
	// ３つ目のメソッド
	public static String add(String x, String y) {
		return x + y;
	}
	// ４つ目のメソッド
	public static int add(int x, int y, int z) {
		return x + y + z;
	}
	public static void main(String[] args) {
		System.out.println(add(10,20));
		System.out.println(add(3.5, 2.7));
		System.out.println(add("Hello", "World"));
		System.out.println(add(10, 20, 30));
	}
}
