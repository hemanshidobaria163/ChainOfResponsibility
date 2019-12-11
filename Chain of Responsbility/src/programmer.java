
public class programmer {

public class PartCollector extends Employee {
	    
	    public PartCollector(int authorityLevel) {
	        this.authorityLevel = authorityLevel;
	    }

	    @Override
	    protected void write(String message) {
	         System.out.println("PartCollector: " + message);
	    }
	}
public class Assembler extends Employee {
	    
	    public Assembler(int authorityLevel) {
	        this.authorityLevel = authorityLevel;
	    }

	    @Override
	    protected void write(String message) {
	         System.out.println("Assemblerer: " + message);
	    }
	}

public class Welder extends Employee {
    
    public Welder(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
         System.out.println("Welder: " + message);
    }
}

public class Painter extends Employee {
    
    public Painter(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
         System.out.println("Painter: " + message);
    }
}
}
