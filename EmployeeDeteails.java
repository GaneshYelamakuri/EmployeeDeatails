package com.jsp.ObjectClass;

import java.util.Objects;

class Address
{
	int HouseNO;
	String area;
	String Landmark;
	String district;
	String state;
	public Address(int HouseNO,  String area, String Landmark, String district, String state) {
		super();
		this.HouseNO = HouseNO;
		this.area = area;
		this.Landmark = Landmark;
		this.district = district;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [HouseNO=" + HouseNO  + ", area=" + area + ", Landmark=" + Landmark
				+ ", district=" + district + ", state=" + state + "]";
	}
	@Override
	public boolean equals(Object arg)
	{
		if(!(arg instanceof Address))return false;
        Address add=(Address)arg;
        return this.HouseNO==add.HouseNO &&
        		this.area.equals(add.area) &&
        		this.Landmark.equals(add.Landmark) &&
        		this.district.equals(add.district) &&
        		this.state.equals(add.state);
       }
}

class EmployeeInfo
{
	int eid;
	String name;
	int salary;
	Address address;
	public EmployeeInfo(int eid, String name, int salary, Address address)
	{
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmployeeInfo [eid=" + eid + ", name=" + name + ", salary=" + salary + ", adress=" + address + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, eid, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof EmployeeInfo)) return false;
		EmployeeInfo emp=(EmployeeInfo)obj;
		return this.eid==emp.eid &&
				this.name.equals(emp.name)&&
				this.salary==emp.salary &&
				this.address.equals(emp.address);
				
	}	
}
public class EmployeeDeteails {

	public static void main(String[] args)
	{
		Address add=new Address(175,"jsp","KLM","ananthapur","Andhra pradesh");
	//	System.out.println(add);
		
		EmployeeInfo emp=new EmployeeInfo(101,"ganesh",75000,add);
		System.out.println(emp);
		
	}

}
