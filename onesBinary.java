import java.util.Scanner;
public class onesBinary {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
		int c=0;
		StringBuffer s  = new StringBuffer();
			int val = sc.nextInt();
			while(val>0) {
				int sing = val%2;
				val =val/2;
				s.append(sing);
				if(sing==1) {
					c++;
				}
			}
			System.out.println(c);
			System.out.println(s.reverse());
		}
	}
}