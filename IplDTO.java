public class IplDTO{
	
	public IplDTO(){
		
	}

    private String nameOfSponser ;
	private int noOfTeams;
	private int noOfUmpires;
	private String mediaRights;
	
	
	
	
	public String getNameOfSponser(){
	return nameOfSponser;
	}
	
	public void  setNameOfSponser(String nameOfSponser){
		this.nameOfSponser = nameOfSponser;
	}

	public int getNoOfTeams(){
	return noOfTeams;
	}

	public void setNoOfTeams(int noOfTeams){
	this.noOfTeams = noOfTeams;
	
	}

	public int getNoOfUmpires(){
	return noOfUmpires;
	}
	
	public void setNoOfUmpires(int noOfUmpires){
	this.noOfUmpires = noOfUmpires;
	}

	public String getMediaRights(){
	return mediaRights;
	}

	public void setMediaRights(String mediaRights){
	this.mediaRights = mediaRights; 	
	}


public void win(){
	
	System.out.println("it is a sport");
}

	
	
	}