public class SideClass{
	private String FriendName ;
	public void setName(String name) {
		FriendName = name ;
	}
	public String getName() {
		return FriendName ;
	}
	public void saying() {
		System.out.printf("Your first friend's name was %s", getName()) ;
	}
}
