import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Sett{
    public static void main(String args[]){
    	
        try (Scanner sc = new Scanner(System.in)) {
			Set<String> ts = new LinkedHashSet<>();
			int x = sc.nextInt();
			while(x-- >0){
			    ts.add(sc.next());
			}
			String str="";
			for(String i:ts)
			    str = str+i+" ";
			System.out.println(str+" ");
		}
    }

}