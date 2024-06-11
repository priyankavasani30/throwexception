package userdefineexception;

public class BelowSalaryException extends Exception {

	public BelowSalaryException()
	{
		System.out.println("please check salary input");
	}
	public BelowSalaryException(String msg)
	{
		System.out.println(msg);
	}
}
