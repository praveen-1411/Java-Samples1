
public class TestMain {
	public static void main(String[] args) {
		//Employee[] emp = new Employee[4];
		Roles r[] = new Roles[3];
		EmployeeReport[] emp = new EmployeeReport[3];
		
		for(int i=1;i<=2;i++) {
			System.out.println("------------"+"Employee"+ i +"----------------");
			System.out.println("Enter the data employee" +i);
			emp[i] = new EmployeeReport();
			r[i]=new Roles();
			storeData(emp[i],r[i]);
			
			}
		for( int i=1;i<=2;i++) {
			System.out.println("Display the data employee" +i);
			
			displayData(emp[i],r[i]);
			//displayData();
			System.out.println("-------------------");
		}
	}
	
	public static void storeData(EmployeeReport emp,Roles r) {
		 //EmployeeReport emp = new EmployeeReport();
		 //Roles r=new Roles();
		 //emp.setEmpReport(emp);
		 System.out.println("Enter employee id:");
		 int empId = Console.readInt();
		 emp.setEmpId(empId);
		 System.out.println("Enter employee name:");
		 String empName = Console.readLine();
		 emp.setEmpName(empName);
		 System.out.println("Enter employee role:");
		 String role = Console.readLine();
		 //r.setRole(role);
		 emp.setEmpRole(role);
		 System.out.println("Enter employee Basic:");
		 int empBasic = Console.readInt();
		 emp.setEmpBasic(empBasic);
		 System.out.println("Enter employee ReportDate:");
		 String empReportDate = Console.readLine();
		 System.out.println("Enter employee HRA:");
		 int empHra = Console.readInt();
		 emp.setEmpHra(empHra);
		 System.out.println("Enter employee allowance percentage:");
		 int allowancePercentage = Console.readInt();
		 emp.setAllowancePercentage(allowancePercentage);
	}
	public static void displayData(EmployeeReport emp,Roles r)
	{
		//Roles r=new Roles();
		SalaryCalculator sc=new SalaryCalculator();
		System.out.println("Employee Id:" + emp.getEmpId());
		System.out.println("Employee Name:" +emp.getEmpName());
		System.out.println("Employee Role:" +r.getRole(emp));
		//System.out.println("Employee Basic:" +emp.getEmpBasic());
		//System.out.println("Employee ReportDate:" +empReportDate);
		//System.out.println("Employee HRA:" +emp.getEmpHra());
		//System.out.println("Employee Allowance Percentage:" +emp.getAllowancePercentage());
		System.out.println("Employee Salary:" +sc.getSalary(emp));
		System.out.println("Employee Allowance:" +sc.getAllowance(emp));
		//System.out.println("Employee Basic:" +sc.getAllowance(emp));
		
	}
}
