class HospitalTester{


	public static void main(String a[]){
	
	Hospital hos = new Hospital();
	PatientDTO dto = new PatientDTO();
	
	dto.setGender(Gender.male);
	dto.setId(1);
	dto.setName("Sparsha ");
	dto.setAddress("Davangere");
	dto.setContactNumber(6705986576l);
	dto.setWardNumber("Fifteen");
	
	
	
	PatientDTO dto1 = new PatientDTO();
	
	dto1.setGender(Gender.female);
	dto1.setId(2);
	dto1.setName("Yamini");
	dto1.setAddress("baglore");
	dto1.setContactNumber(9867563423l);
	dto1.setWardNumber("sixteen");
	
	
	
	
	PatientDTO dto2 = new PatientDTO();
	
	dto2.setGender(Gender.male);
	dto2.setId(3);
	dto2.setName(" Rocky");
	dto2.setAddress("tumkur");
	dto2.setContactNumber(9876453221l);
	dto2.setWardNumber("seventeen");
	
	
	
	
	PatientDTO dto3 = new PatientDTO();
	
	dto3.setGender(Gender.female);
	dto3.setId(4);
	dto3.setName("Yamuna");
	dto3.setAddress("Nelmangla");
	dto3.setContactNumber(5679877578l);
	dto3.setWardNumber("eighteen");
	
	
	
	PatientDTO dto4 = new PatientDTO();
	
	dto4.setGender(Gender.transgender);
	dto4.setId(5);
	dto4.setName("Nazz joshi ");
	dto4.setAddress("New delhi");
	dto4.setContactNumber(6578765454l);
	dto4.setWardNumber("ninteen");
	
	
	
	
	hos.createPatient(dto);
	hos.createPatient(dto1);
	hos.createPatient(dto2);
	hos.createPatient(dto3);
	hos.createPatient(dto4);
	hos.getPatientDetails();
	
	
	
	
	
	
	}











}