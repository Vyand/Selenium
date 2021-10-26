public class BestEmployee extends Employee {
	private double bonus;

    public BestEmployee(int id, String name, long salary,double bonus) {
        super(id, name, salary);
        this.bonus  = bonus;
        this.Salary =  salary + this.bonus;
    }

	public static void main(String[] args) 
	{
		
		BestEmployee bestEmp = new BestEmployee(1,"Bohlokwa Morite",10000,100);
        Employee emp = new Employee(2,"Mr Slatan",10000);
        
        System.out.println("Best Employee ID is: " + bestEmp.getId() + ", and salary is: " + "R" + bestEmp.getSalary()  );
        System.out.println("Employer ID is: " + emp.getId() + ", and salary is: " + "R" + emp.getSalary()  );
        System.out.println("");
        System.out.println("Employee of the month gets paid more than the employer. Hardwork does pay! " + "congratulations " + bestEmp.getName()  );
    

	}

}