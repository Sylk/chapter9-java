
public class ShiftSupervisor extends Employee{

	private double _annualSalary;
	private int _annualProduction;
	
	public ShiftSupervisor(String _employeeName, String _employeeNumber, String _hireDate, double _annualSalary, int annualProduction){
		super(_employeeName, _employeeNumber, _hireDate);
		set_annualProduction(annualProduction);
		set_annualSalary(_annualSalary);
	}

	public String toString(){
		String str ="Employee Name : "+ get_employeeName() +"\nEmployee Number : "+ get_employeeNumber()+"\nHire Date : "+get_hireDate()+"\nAnnual Salary : "+get_annualSalary()+"\nAnnual Production : "+get_annualProduction();
		return str;
	}
	public double get_annualSalary() {
		return _annualSalary;
	}

	public void set_annualSalary(double _annualSalary) {
		this._annualSalary = _annualSalary;
	}

	public int get_annualProduction() {
		return _annualProduction;
	}

	public void set_annualProduction(int _annualProduction) {
		this._annualProduction = _annualProduction;
	}
}
