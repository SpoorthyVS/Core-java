class EngineerTester{

	public static void main(String a[]){
		Engineer engg = new Engineer();
		engg.duration = "4 years";
		engg.collegeName = "Dayanand sagar college of engineering";
		engg.collegeAddress = "Banglore";
		engg.typeOfEducation = "Autonomous";
		
		engg.problemSolving();
		System.out.println("Engineer solves problems");
		System.out.println("I am Studying in "+ engg.collegeName);
		System.out.println("my college is in "+ engg.collegeAddress);
		System.out.println("My college is an "+ engg.typeOfEducation + " affiliated college");
		
		CivilEngineer civil = new CivilEngineer();
		civil.constructStructures();
		
		CsEngineer cs = new CsEngineer();
		cs.softWareDeveloper();
		
		MechanicalEngineer mech = new MechanicalEngineer();
		mech.solvesProblemInMachines();
		
		EeEngineer ee = new EeEngineer();
		ee.solvesDistributionProblems();
		
		ChemicalEngineer chemical = new ChemicalEngineer();
		chemical.chemicalAndMaterials();
	
	}


}