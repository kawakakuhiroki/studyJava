package sukkiri_java;

public class Code4_9 {
	public static void main(String[] args) {
		int[] scores= {20,30,60,80,90};
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		int total = 0;
		for(int y = 0; y < scores.length; y++) {
			total = total + scores[y];
		}
		System.out.println(total);
	}
}
