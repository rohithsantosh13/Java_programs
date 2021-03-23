import java.util.Scanner;
public class ZigZag_String {
	    private String str;
		public String convert(String s, int numRows) {

	        if (numRows == 1) return s;
            setStr(" ");
	        String ret = "";
	        int n = s.length();
	        int cycleLen = 2 * numRows - 2;

	        for (int i = 0; i < numRows; i++) {
	            for (int j = 0; j + i < n; j += cycleLen) {
	               ret= ret+(s.charAt(j + i));
	                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
	                    ret=ret+(s.charAt(j + cycleLen - i));
	            }
	        }
	        return ret.toString();
	    }
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ZigZag_String ob = new ZigZag_String();
			String str =  sc.nextLine();
			int val  = sc.nextInt();
			System.out.println(ob.convert(str, val));
		}
		

	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}

}

