public class MilitaryTime {
	private int hour , minute , second ;
	public void CheckTime (int h , int m , int s) {
		hour = ((h>=0 && h<24) ? h : 0) ;
		minute = ((m>=0 && h<60) ? m : 0) ;
		second = ((s>=0 && s<60) ? s : 0) ;
	}
	public String SetMilitary() {
		return String.format("%02d:%02d:%02d" , hour , minute , second);
	}
}
