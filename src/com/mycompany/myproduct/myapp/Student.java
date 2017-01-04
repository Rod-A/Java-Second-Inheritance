/**
 * 
 */
package com.mycompany.myproduct.myapp;

/**
 * @author roddy
 *
 */
public class Student extends PersonBase implements Studying {

	
	private String grade;
	private String id;
	
	public Student()
	{
		//super();
		super("roddy", 10);
	}
	public Student(String _name, Integer _age)
	{
		super(_name, _age); // ref to the constructor from the parent class;
		
	}
	
//	public Student(String _name, Integer _age, String _grade)
//	{
//		super.name = _name;
//		super.age = _age;
//		grade = _grade;
//	}
	
	public Student(String _name, Integer _age, String _grade)
	{
		this(_name, _age); // ref to the constructor above;
		grade = _grade;
		
	}
	
	public Student(String _name, Integer _age, String _grade, String _id)
	{
		this(_name, _age, _grade);
		id = _id;
		
	}
	
	/* (non-Javadoc)
	 * @see javap02.person#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public String getName(String name, Integer age){
		
		return name; 
		
	}

	/* (non-Javadoc)
	 * @see javap02.person#getAge()
	 */
	@Override
	public Integer getAge() {
		// TODO Auto-generated method stub
		return age;
	}
	
	public String Studyfor() {
		// TODO Auto-generated method stub
		return "JAVA";
	}
	@Override
	public String studyFor() {
		// TODO Auto-generated method stub
		return null;
	}

}