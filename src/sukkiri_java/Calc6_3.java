package sukkiri_java;

public class Calc6_3 {
	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = CalcLogic.tasu(a, b);
		int delta = CalcLogic.hiku(a, b);
		int multiply = CalcLogic.kakeru(a, b);
		double divide = CalcLogic.waru(a, b);
		System.out.println("足すと" + total + "、引くと" + delta + "、かけると" + multiply + "、割ると" + divide);
	}
}
