class LibraryImpl implements Library{


	BookDTO[] dtos;
		
	int index;
	
	public Library(int size){
		dtos = new BookDTO[size];
		System.out.println("the library constanat is called");
	
		
	}
	
	@Override
	public boolean searchBook(BookDTO dto){
		
		boolean isAvailable = false ;
		if(dto !=null || dto.getName() != null){
			this.dtos[index++] = dto;
			isAvailable = true;
			System.out.println("book is available");
		
			}
		else{
			
			System.out.println("book is not avavilable");
			
		}
		return isAvailable;
		
	
	
	}
	
	
	@Override
	public void getBookDetails(){
			
			System.out.println("the book details are");
			
		for(int i=0;i<dtos.length;i++){
			
	System.out.println(dtos[i].getId() + " " + dtos[i].getName() + " " + dtos[i].getAuthorName() + " " + dtos[i].getPrice());
			
		}
			
			
		}

	@Override
	public boolean UpdateBookPriceById(int id , int price){
		
		System.out.println("inside the updatbook peice by id");
		boolean updatedBookPrice = false;
		
		for(int i = 0; i<dtos.length; i++){
			
			if(dtos[i].getId() == id){
				
				dtos[i].setPrice(price);
				updatedBookPrice = true;
			}
			else{
				
				System.out.println("the entered id is wrong");
			}
		}
		
		
		return updatedBookPrice;
		
		
		
		
		
	}
	
	@Override
	public boolean UpdateBookPriceByName(String name , int price){
		
		System.out.println("inside the updatbook peice by id");
		boolean updatedBookPrice = false;
		
		for(int i = 0; i<dtos.length; i++){
			
			if(dtos[i].getName().equals(name)){
				
				dtos[i].setPrice(price);
				updatedBookPrice = true;
			}
			else{
				
				System.out.println("the entered id is wrong");
			}
		}
		
		
		return updatedBookPrice;
		
		
		
		
		
	}
	
	@Override
	public boolean deleteBookById(int id){
				boolean bookDeleted = false;
			System.out.println("inside book patient");
				
			for(int i=0 ,j = 0; j<dtos.length;j++){
				
				if (dtos[j].getId() != id){
					//dtos[i] = null;
					dtos[i++] = dtos[j];
					//bookDeleted =  true;
					
				}
			dtos =	Arrays.copyOf(dtos , i);
			}
			
			return bookDeleted;
			
		}
	
	
	  @Override
      public boolean deleteBookByName(String name){
				boolean bookDeleted = false;
			System.out.println("inside book patient");
				
			for(int i=0 ,j = 0; j<dtos.length;j++){
				
				if (!dtos[j].getName().equals(name)){
					//dtos[i] = null;
					dtos[i++] = dtos[j];
					//bookDeleted =  true;
					
				}
			dtos =	Arrays.copyOf(dtos , i);
			}
			
			return bookDeleted;
			
		}








}