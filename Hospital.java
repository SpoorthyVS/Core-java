interface Hospital{

	boolean createPatient(PatientDTO dto);
	void getPatientDetails();
	boolean updatePatientAddressById(int id, String address);
	boolean updatePatientContactNumberByName(String name, long contactNumber);
	boolean deletePatientByName(String name);




}