public class Roles {
	String role;
	
	//private double role1;
	//private String role2;
	/*public double getRole1() {
		role1=role;
		return role1;
	}*/
	/*public void setRole(double role1) {
		this.role1=role1;
	}*/
	public void setRole(String role) {
		this.role=role;
	}
	public String getRole(EmployeeReport emp) {
		//this.role=role;
		
			
		if(emp.empRole == "A") {
			//System.out.println("Software Developer");
			//return emp.empRole;
			return "Manager";
		}
		else if(emp.empRole== "B") {
			//System.out.println(" Manager");
			//return emp.empRole;
			return "developer";
		}
		else if(emp.empRole == "C") {
			
			//System.out.println("is Software Tester");
			//return emp.empRole;
			return "tester";
		}
		else if(emp.empRole == "D") {
			//System.out.println( "HR");
			//return emp.empRole;
			return "HR";
		}
		else {
			//System.out.println("Does Not Exist");
			//return emp.empRole;
			return "undefined";
		}
		//return 0;
	}
	
}

