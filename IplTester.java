class IplTester{


public static void main(String a[]){


IplDTO ipl = new IplDTO();

ipl.setNameOfSponser("vivo IPL");
ipl.setNoOfTeams(10);
ipl.setNoOfUmpires(15);
ipl.setMediaRights("star sports");



System.out.println("the sponser of ipl teams is "+ipl.getNameOfSponser() + ".....there are total of          " + ipl.getNoOfTeams() + " teams" +"........the total number of umpires are "+ ipl.getNoOfUmpires() + " .... the media rights is " + ipl.getMediaRights()); 


ipl.win();


}













}