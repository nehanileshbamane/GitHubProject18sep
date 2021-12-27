package inheritance;

public class ChildClass extends ParentClass
{
	public void m4()
	{

	System.out.println("m4 method of childclass");
	}
	
	public static void main(String[] args) 
	{
		ChildClass ch=new ChildClass();
		ch.m4();
	}

}
