package Abstraction;

abstract class Employee{
	void empDetails() {
		System.out.println("Employee Details are : john from England");
	}
	
	abstract void salary();
}

class HRDepartment extends Employee{
	void salary() {
		System.out.println("salary Details : Rs 56000");
	}
}

public class Test1 {
	
	public static void main(String[] args) {
		HRDepartment obj = new HRDepartment();
		obj.empDetails();
		obj.salary();
	}

}
