class DegreeTester{
	
	public static void main (String a[]){
		Degree eng = new Degree();
		eng.universityName = "VTU";
		eng.duration = "4 years";
		
		
		eng.problemSolving();
		eng.business();
		System.out.println("Degree is of " + eng.duration);
		
		Engineering engg = new Engineering();
		engg.problemSolving();
	}
	


}