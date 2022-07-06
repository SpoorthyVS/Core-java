class IplTester{


public static void main(String a[]){


Ipl ipl = new Ipl();

ipl.setnameOfSponser("vivo IPL");
ipl.setnoOfTeams(10);
ipl.setnoOfUmpires(15);
ipl.setmediaRights("star sports");



System.out.println("the sponser of ipl teams is "+ipl.getnameOfSponser() + ".....there are total of " + ipl.noOfTeams() + " teams" +"........the total number of umpires are "+ ipl.getnoOfumpires() + " .... the media rights is " + ipl.getmediaRights()); 


ipl.win();


}













}