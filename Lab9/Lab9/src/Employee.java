public class Employee {
	private EmpReport empReport;
	private RoleBuilder roleBuilder;
	private SalaryCalculator salaryCalculate;
	private float salary;
	public EmpReport getEmpReport() {
		return empReport;
	}
	public void setEmpReport(EmpReport empReport) {
		this.empReport = empReport;
	}
	public RoleBuilder getRoleBuilder() {
		return roleBuilder;
	}
	public void setRoleBuilder(RoleBuilder roleBuilder) {
		this.roleBuilder = roleBuilder;
	}
	public SalaryCalculator getSalaryCaluculate() {
		return salaryCaluculate;
	}
	public void setSalaryCaluculate(SalaryCalculator salaryCaluculate) {
		this.salaryCaluculate = salaryCaluculate;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}