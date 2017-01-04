/**
 * 
 */
package com.mycompany.myproduct.myapp;

/**
 * @author roddy
 *
 */
public class Professor extends PersonBase implements Person {
	
	private String title;
	
	public Professor(String _name, int _age, String _title) {
		super(_name, _age);
		title = _title;
		// TODO Auto-generated constructor stub
	}
	

	/* (non-Javadoc)
	 * @see javap02.person#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Prof" + super.getName();
	}

	/* (non-Javadoc)
	 * @see javap02.person#getAge()
	 */
	@Override
	public Integer getAge() {
		// TODO Auto-generated method stub
		return age;
	
	
	}

}