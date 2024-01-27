package paiza;
import java.util.*;

public class D096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if(line.matches(".*(I|l|i).*")) {
        	System.out.println("caution");
        } else {
        	System.out.println(line);
        }
    }
}
