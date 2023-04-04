package sukkiri_java;

public class Code5_4 {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("河角");
		hello("矢倉");
		hello("西田");
	}
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}
}
