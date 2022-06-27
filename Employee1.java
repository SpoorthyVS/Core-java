class Employee1{


	 //instance variables
	  String employeeName ; 
	  String bloodGroup ;
	  String employeeLocation;
	  long contactNo;
	  
	// Parameterized Constructor
	public Employee1(String eName, String bGroup, String eLocation){
		System.out.println("Employee ID Created");
		employeeName = eName;
		bloodGroup = bGroup;
		employeeLocation = eLocation;
		contactNo = cNo;
	}
	//main method-----starting point
    public static void main(String a[]){
		
	//constructor are used to initialize the instance variable of a class
	
	 Employee1  empl  = new Employee1("Gowda C K", "B+", "Tumkur",5875439754l);
	 System.out.println(empl.employeeName+"    "+empl.bloodGroup+"   "+empl.employeeLocation+"  "+empl.contactNo);
	 Employee1    empl1  = new Employee1("Yogesh T S", "O+", "Mysore",5595748593l);
     System.out.println(empl1.employeeName+"    "+empl1.bloodGroup+"   "+empl1.employeeLocation+"  "+empl1.contactNo);	 
	 Employee1    empl2  = new Employee1("Spoorthy V S", "AB+", "Davanagere",4857402758l);	
	 System.out.println(empl2.employeeName+"    "+empl2.bloodGroup+"   "+empl2.employeeLocation+"  "+empl2.contactNo);
	}
		

	}

   


