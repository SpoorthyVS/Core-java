class Pharmacy{
	
	String name;
	String address;
	Long contactNo;
	String [] medicinesList = {"Dolo 650", "vitamin D tablet"};
	
	public static void main (String a[]){
	
		Pharmacy pharmacy = new Pharmacy() ;
		pharmacy.name = "Apollo Pharmacy";
		pharmacy.address = "kumarswamy layout";
		pharmacy.contactNo = 5647295482l;
	
		System.out.println(" name of the pharmacy is "+ pharmacy.name);
		System.out.println(" address of the pharmacy is "+ pharmacy.address);
		System.out.println(" contactNo of the phxarmacy is "+ pharmacy.contactNo);
		pharmacy.getmedicineList();
		
		
		}
	
	
	public void getmedicineList (){
		for (int z = 0; z < medicinesList.length; z++){
			System.out.println(medicinesList[z]);
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	}






