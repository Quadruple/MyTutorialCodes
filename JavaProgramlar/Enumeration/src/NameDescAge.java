public enum NameDescAge {
	Atakan("Awesome" , "20") ,
	Birbey("Super" , "20") ,
	Ege("Reckless" , "20") ,
	Omer("Excited" , "20") ;
	private final String desc ;
	private final String year ;
	NameDescAge (String description , String birthday) {
		desc = description ; 
		year = birthday ;
	}
	public String getDesc() {
		return desc ;
	}
	public String getYear() {
		return year ;
	}
}
