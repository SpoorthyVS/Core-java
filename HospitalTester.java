class HospitalTester{

	public static void main(String a[]){
		
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of patient ");
	int size = sc.nextInt();
	

	
	
	Hospital hos = new Hospital(size);
	
	for(int i=0; i<size; i++){
		
	PatientDTO dto = new PatientDTO();
	
	System.out.println("Enter the patient name");
	String name =sc.next();
	System.out.println("Enter the patient address");
	String address = sc.next();
	System.out.println("Enter the patient id");
	int id = sc.nextInt();
	System.out.println("Enter patient gender");
	String gender = sc.next();
	System.out.println("Enter the patient contact number");
	long contactNumber = sc.nextLong();
	System.out.println("Enter the patient ward number");
	String wardNumber = sc.next();
	
	
	
	//dto.setGender(Gender.male);
	dto.setName(name);
	dto.setAddress(address);
	dto.setId(id);
	dto.setGender(Gender.valueOf(gender));
	dto.setContactNumber(contactNumber);
	dto.setWardNumber(wardNumber);
	

	
	hos.createPatient(dto);
	
	}
	
	String option = null;
	//blog
	do{
		System.out.println("Enter 1 to fetch all the patients");
		System.out.println("Enter 2 to update patient contact number by name");
		System.out.println("Enter 3 to update patient address by id");
		System.out.println("Enter 4 to delete Patient By Name");
		int choice = sc.nextInt();
		
		
		switch (choice){
			
			case 1 : hos.getPatientDetails();
					 break;
			case 2 : System.out.println("Enter the existing name for which contact number have to be updated");
					 String existingName = sc.next();
					 System.out.println("Enter the contact number to be updated");
					 long updatedContactNumber = sc.nextLong();
					 hos.updatePatientContactNumberByName( existingName, updatedContactNumber );
					 break;
			case 3 : System.out.println("enter the existing id for which address have to be updated");
					 int existingId=sc.nextInt();
					 System.out.println("Enter the  address to be updated");
					 String updatedAddress = sc.next();
					 hos.updatePatientAddressById(existingId, updatedAddress);
					 break;
			case 4 : System.out.println("Enter the name to delete the patient");
					 String nameToBeDeleted = sc.next();
					 hos.deletePatientByName(nameToBeDeleted);
					 break;
			default: System.out.println("Given Choice cannot be delivered"); 
					 break;
					 
		//System.out.println("Enter the choice");
		}
		
		System.out.println("Do you want to continue Y/N");
		option = sc.next();
		
	}while(option.equals("Y"));








}