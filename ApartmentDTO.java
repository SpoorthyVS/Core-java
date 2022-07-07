//DTO {data transfer object}..DTO is a design pattern
//1st rule
public class ApartmentDTO{
	
	//2nd rule
	public ApartmentDTO(){
		
	}
	//3rd rule
	private int id;
	private String name;
	private String owner;
	
	/*we write getter by having prefix as get
	"public returnType getVariableName(){
		return variableName;
	}"*/
	/*we can write setter by having prefix as set
	"public void setVariableName(){
		this.variableName = variableName;
	}"*/
	
	//4th rule
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	
	public String getOwner(){
		return owner;
	}
	public void setOwner(String owner){
		this.owner=owner;
	}
	
	
	//go thourgh dto concept
	



}