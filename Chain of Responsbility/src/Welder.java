
  public class Welder extends Employee {
  
	  		public Welder(int authorityLevel) { this.authorityLevel = authorityLevel; }
  
	  			@Override
	  			protected void write(String message) {
	  					System.out.println("Welder: " + "All parts have been welded together"); 
	  					
  
	  	}
  
  }
 