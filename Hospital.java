class Hospital{
	//has many patients .........1 to 1 and 1 to many
	//array is fixed in size (feature of array)
	//Patient is a class name in complie time and turns into object while runtime
	PatientDTO[] dtos = new PatientDTO[5]; //Syntax of array
	
	
	//instance variable
	int index;
	
	public Hospital(){
		System.out.println("Hospital constructor is called");
	}
	

//null is default value for all the non primitive type
	public boolean createPatient(PatientDTO dto){
		System.out.println("inside create Patient method");
		boolean isAdded = false;
		if(dto != null &&/*ampersent*/ dto.getName() != null){
			this.dtos[index++]=dto;
			isAdded = true;
		System.out.println("Patient details added successfully");
		}
		else{
			System.out.println("cannot add patient......please fill the mandatory fields");
		}
		return isAdded;
	}
	
	
	public void getPatientDetails(){
		System.out.println("inside getPatientDetails");
		for(int i=0; i<dtos.length; i++){
			System.out.println(dtos[i].getId() + "  " +dtos[i].getName() +"    "+dtos[i].getAddress() + "   " +dtos[i].getGender()+"  "+dtos[i].getContactNumber()+"    "+dtos[i].getWardNumber());
		}
	}




}