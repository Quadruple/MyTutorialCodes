public enum NameDescAge {
	Atakan("Awesome" , "20") ,
	Birbey("Super" , "20") ,
	Ege("Reckless" , "20") ,
	Omer("Excited" , "20") ,
	Mischone("Katana" , "35") ,
	Glenn("Pizza" , "27") ,
	Beth("Hot" , "21") ;
	private final String desc ;
	private final String year ;
	NameDescAge(String description , String age) {
		desc = description ;
		year = age ;
	}
	public String getDesc() {
		return desc ;
	}
	public String getAge() {
		return year ;
	}
}
