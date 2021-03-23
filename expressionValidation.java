import java.util.*;

public class expressionValidation {
    public static void main(String[] args) {
    		try (Scanner sc = new Scanner(System.in)) {
				String str = sc.nextLine();
				String exp = "";
				int l = str.length();

				for(int i=0;i<l;i++){
				    if(str.charAt(i)=='{'||str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='}'||str.charAt(i)==']'||str.charAt(i)==')'){
				        exp+=str.substring(i,i+1);
				    }
				}   
				stack ob = new stack();
				System.out.println(ob.isValid(exp)?"Balanced":"NOT Balanced");
			}
		
    }
}
class stack{
	boolean isValid(String exp){
		int l =exp.length();
		 if(l%2!=0)
	        	return false;
		 Stack<Character> st = new Stack<Character>();
		 for(int i=0;i<l;i++) {
			 if(exp.charAt(i)=='{' ||exp.charAt(i)=='(' ||exp.charAt(i)=='[' ) {
				 st.push(exp.charAt(i));
			 }
			 else if(exp.charAt(i)=='}' && !(st.isEmpty()) && st.peek()=='{') {
				 st.pop();
			 }
			 else if(exp.charAt(i)==')' && !(st.isEmpty()) && st.peek()=='(') {
				 st.pop();
			 }
			 else if(exp.charAt(i)==']' && !(st.isEmpty()) && st.peek()=='[') {
				 st.pop();
			 }
			 String str = st.toString();
			 System.out.println(str);
		 }
		return st.isEmpty();
	}
	//"([}}])" "([}}])"
}