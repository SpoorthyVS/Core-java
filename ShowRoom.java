class ShowRoom {

int showRoomId;
static String name = "woodland" ;
 static int noOfBranches = 56;
 String location;
 long contactNo;
 
 public ShowRoom(){
 System.out.println("ShowRoom object is created");
 }
 
 public static void main (String a[]){
 
 ShowRoom show = new ShowRoom ();
 show.showRoomId = 1 ;

 show.location = "commercial street";
 show.contactNo = 1231236L;
 
 
 System.out.println(show.showRoomId);
 System.out.println(ShowRoom.name + " " + ShowRoom.noOfBranches + " ");
 System.out.println(show.location);
 System.out.println(show.contactNo);
 
 
 
 
 ShowRoom show1 = new ShowRoom() ;
 show1.showRoomId = 2;

 show1.location = "vijaynagar";
 show1.contactNo = 4564569L;
 
 
  
 System.out.println(show1.showRoomId);
 System.out.println(ShowRoom.name + " " + ShowRoom.noOfBranches + " ");
 System.out.println(show1.location);
 System.out.println(show1.contactNo);
 
 
 
 
 
 
 }
 






}