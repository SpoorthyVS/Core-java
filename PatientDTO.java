class PatientDTO{
	

	private int id;
	private String name;
	private String address;
	private Gender gender;
	private long contactNumber;
	private String wardNumber;

	public PatientDTO(){
		System.out.println("Patient constructor is called ");
	}
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}


	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address=address;
	}
	
	//enum is also an non primitive datatype
	//enum can be used where there is limited type of data
	public Gender getGender(){
		return gender;
	}
	public void setGender(Gender gender){
		this.gender=gender;
	}

	
	public long getContactNumber(){
		return contactNumber;
	}
	public void setContactNumber(long contactNumber){
		this.contactNumber=contactNumber;
	}

	public String getWardNumber(){
		return wardNumber;
	}
	public void setWardNumber(String wardNumber){
		this.wardNumber=wardNumber;
	}

}