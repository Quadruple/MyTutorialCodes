import java.util.* ;
public class Main {
	public static void main (String args[]) {
		Stack<String> thestack = new Stack<String>() ;
		thestack.push("Buttom") ;
		printStack(thestack) ;
		thestack.push("Second") ;
		printStack(thestack) ;
		thestack.push("Third") ;
		printStack(thestack) ;
		thestack.pop() ;
		printStack(thestack) ;
		thestack.pop() ;
		printStack(thestack) ;
		thestack.pop() ;
		printStack(thestack) ;
	}
	private static void printStack(Stack<String> s) {
		if (s.isEmpty()) 
			System.out.println("Your stack is now empty");
		else 
			System.out.printf("%s The top one is at left \n", s) ;
	}
}
