public class FirstandSecond {
	private String FriendName ;
	public FirstandSecond(String name) {
		FriendName = name ;
	}
	public String getName() {
		return FriendName ;
	}
	public void saying () {
		System.out.printf("Your first friend's name was %s\n", getName() ) ;
	}

}
