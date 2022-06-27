class Hijack{

		public Hijack()
		{
		System.out.println("Hijack object is created");
		Hijack hijack = new Hijack();
		System.out.println(hijack);
		
		}

		public static void main(String a[])
		{
		Hijack hijack = new Hijack();
		System.out.println(hijack);
		}



}