public class mainDriver {
	private static Employee getChainOfEmployees() {
        Employee PartCollector = new PartCollector(Employee.PART_COLLECTOR);
        Employee Assembler = new Assembler(Employee.ASSEMBLER);
        Employee Welder = new Welder(Employee.WELDER);
        Employee Painter = new Painter(Employee.PAINTER);
        
       
        PartCollector.setNextEmployee(Assembler);
        Assembler.setNextEmployee(Welder);
        Welder.setNextEmployee(Painter);
     
       
        return PartCollector;
    }

    public static void main(String[] args) {
    	
        Employee employeeChain = getChainOfEmployees();
        
        employeeChain.doWork(Employee.PART_COLLECTOR, "All parts have been gathered");
      
    }

}
