package sukkiri_java;

public class Code4_19 {
	public static void main(String[] args) {
		int[][] scores = {{40,50,60},{80,60,70,90}};
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		for(int[] i : scores) {
			for(int y : i){
				System.out.println(y);
			}
		}
	}
}