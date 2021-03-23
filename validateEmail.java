import java.util.Scanner;
import java.util.regex.*;


;public class validateEmail {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String email = sc.nextLine();
			String valid = "[a-zA-Z0-9._+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+";
			String valid2 = ".*0_.*";
			boolean x = Pattern.matches(valid, email);
			boolean x1 = Pattern.matches(valid2, email);
			System.out.println((x==true&x1==false)?"Valid":"Invalid");
		}
	}

}
//rohith.santosh13@gmail.com