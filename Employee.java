package userdefineexception;

public class Employee {

	private String ename;
	private int salary;
	
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename=ename;
	}
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		
		try
		{
			if(salary<5000)
			{
				//throw new BelowSalaryException();
				throw new BelowSalaryException("salary must be > 5000");
			}
			else
			{
				this.salary=salary;
			}
			
		}catch(BelowSalaryException be) {
			System.out.println(be.getMessage());
		}
		
		
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee [ename = " + ename + ",salary = " + salary + "]";
	}
}
