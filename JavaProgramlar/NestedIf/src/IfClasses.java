public class IfClasses {
	private int People ;
	public void Assign(int people) {
		People = people ;
	}
	public int Return() {
		return People ;
	}
	public void Say() {
		if (People<30){
			System.out.println("You are asocial! ");
		}
		else {
			if (People<60) {
				System.out.println("You are popular ! ");
			}
			else {
				System.out.println("You are famous ! ");
			}
		}
	}
}
