public class TimeMain {
	public static void main (String args[]) {
		MilitaryTime MilitaryObject = new MilitaryTime() ;
		MilitaryObject.CheckTime(22,21,13);
		System.out.println(MilitaryObject.SetMilitary());
	}
}
