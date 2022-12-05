public class SalaryCalculator {
	private float salary;
	private float allowance;
	public float getSalary(/*double basic,double hra,double allowance,*/EmployeeReport emp) {
		salary=emp.empBasic+emp.empHra+emp.allowancePercentage;
		return salary;
	}
	public void setSalary(float salary) {
		this.salary=salary;
	}
	public float getAllowance(/*double basic,double allowancesper*/EmployeeReport emp) {
		allowance=emp.empBasic+(emp.allowancePercentage/100);
		return allowance;
	}
	public void setAllowance(float allowance) {
		this.allowance=allowance;
	}
}
