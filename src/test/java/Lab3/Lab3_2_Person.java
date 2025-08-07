package Lab3;

public class Lab3_2_Person
{
	public String name;
	public float age;
	public Lab3_2_Person(String name, float age) throws Lab3_2_ValidAgeException
	{
		if(age>15)
		{
			this.name=name;
			this.age=age;
		}
		else
		{
			throw new Lab3_2_ValidAgeException("Invalid Age");
		}
		
	}
	public String getName()
	{
		return name;
	}
	public float getAge()
	{
		return age;
	}
	public String toString()
	{
		return name+" "+age;
	}
	
}