package paiza;

import java.util.Scanner;

public class C097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 1; i < n + 1; i++) {
        	int resultA = 0;
        	int resultB = 0;
        	if(i % a == 0) {
        		System.out.print("A");
        		resultA = 1;
        	}
        	if (i % b == 0) {
				System.out.print("B");
				resultB = 1;
			}
        	if(resultA == 0 && resultB == 0) {
        		System.out.print("N");
        	}
        	System.out.println();
        }
    }
}
