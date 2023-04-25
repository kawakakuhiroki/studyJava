package sukkiri_java;

public class Ren5_4 {
	public static double calcTriangleArea(double bottom,double height) {
		double area = bottom * height / 2;
		return area;
	}
	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
	public static void main(String[] args) {
		System.out.println("三角形の面積：" + calcTriangleArea(10.0, 5.0) + "cm");
		System.out.println("円の面積：" + calcCircleArea(5.0) + "cm");
	}
}
