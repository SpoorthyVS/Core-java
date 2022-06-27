class Vegetables{
		static String Vegetables[]={"Tomato","Potato","Onion","Bindi"};
		public static void main (String a[]){
			String value = getVegetable("Potato");
			System.out.println("Tarkari thogond ba"+value);
		}
		public static String getVegetable(String Vegetable){
			String VegetableName = null;
			for(int i=0; i< Vegetables.length; i++){
			if(Vegetables[i]==Vegetable){
				VegetableName=Vegetables[i];
			}
		}
		return VegetableName;
	}
		












}