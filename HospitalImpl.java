class HospitalImpl implements Hospital {
	
	PatientDTO[] dtos ; 
	
	int index;
	
	public Hospital(int size){
		dtos = new PatientDTO[size];
		System.out.println("Hospital constructor is called");
	}
	
	@override
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
	
	@override
	public void getPatientDetails(){
		System.out.println("inside getPatientDetails");
		for(int i=0; i<dtos.length; i++){
			System.out.println(dtos[i].getId() +"     "+dtos[i].getName()+"     "+dtos[i].getAddress()+"         "+dtos[i].getAddress()+"    " +dtos[i].getContactNumber()+"     "+dtos[i].getWardNumber());

		}
	}

	@override
	public boolean updatePatientAddressById(int id, String address){
		System.out.println("inside updatePatientAddressById method is created");
		boolean updateAddress = false;
		for(int i=0; i<dtos.length; i++){
			if(dtos[i].getId() == id){
			dtos[i].setAddress(address);
			updateAddress = true;
			System.out.println("Patient details updated successfully...........");
			}	
			else{
			System.out.println("the patient id is not matching.....");
			}
		}
		return updateAddress;
	}
	
	@override
	public boolean updatePatientContactNumberByName(String name, long contactNumber){
		System.out.println("inside updatePatientContactNumberByName method is created");
		boolean updateContactNumber = false;
		for(int i=0; i<dtos.length; i++){
			if(dtos[i].getName() == name){
			dtos[i].setContactNumber(contactNumber);
			updateContactNumber = true;
			System.out.println("Patient contact Number updated successfully...........");
			}	
			else{
			System.out.println("the patient name is not matching.....");
			}
		}
		return updateContactNumber;
	}
	
	

	@override
	public boolean deletePatientByName(String name){
		System.out.println("inside deletePatientByName method");
		boolean patientDeleted = false;
		int newIndex,oldIndex;
		for( newIndex=0,oldIndex=0; oldIndex<dtos.length; oldIndex++){/*equals() is used to match 2 String type of data........equals() method gives more readability than ==.............equals() method and relational operators return type is boolean ............equalsIgnoreCase() this will ignore the cases in string will ignore case .......... */
			if(!dtos[oldIndex].getName().equals(name)){
				
				dtos[newIndex++]=dtos[oldIndex];
				patientDeleted = true;
			}
			else{
				System.out.println("Patient name is not matching");
			}
			
		}
		//helps us to have new data 
		dtos = Arrays.copyOf(dtos, newIndex);
		return patientDeleted;
		
		
	}



















}