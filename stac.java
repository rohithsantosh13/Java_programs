import java.util.Scanner;
import java.util.Stack;

public class stac {
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
			Stack<Integer> st = new Stack<>();
			  int x = sc.nextInt();
			  while (x-- >0) {
			       st.push(sc.nextInt());
			  }
			  for(Integer i:st){
			       System.out.println(i);
			  }
		}
     }
}