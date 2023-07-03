package paiza;

import java.util.*;

public class C084 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String line = sc.nextLine();
	    // 標準入力の文字数をカウント
	    int cnt = line.length();
	    // 文字数分+2のアスタリスクを出力
	    for(int i = 0; i < cnt + 2; i++) {
	    System.out.print("+");
	    }
	    // 中央行を出力
	    System.out.println();
	    System.out.println("+" + line + "+");
	    // 文字数分+2のアスタリスクを出力
	    for(int i = 0; i < cnt + 2; i++) {
	    System.out.print("+");
	    }
	}
}