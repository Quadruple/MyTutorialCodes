import java.util.* ;
public class Main {
	public static void main (String args[]) {
		PriorityQueue<String> theque = new PriorityQueue<String>() ;
		theque.offer("First") ;
		theque.offer("Second") ;
		theque.offer("Third") ;
		System.out.printf("%s ", theque) ;
		System.out.println() ;
		System.out.printf("%s ", theque.peek()) ;
		System.out.println() ;
		theque.poll() ;
		System.out.printf("%s ", theque) ;
	}
}
