
public class CompanyEmpWage {
	public final String company;
	public final int PAY_PER_HOUR;
	public final int NUM_OF_WORKING_DAYS;
	public final int MAX_HRS_IN_MONTH;
	public int totalWage;
	
	
	public CompanyEmpWage(String company, int PAY_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH){
		this.company = company;
		this.PAY_PER_HOUR = PAY_PER_HOUR;
		this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
		this.totalWage = 0;
	}
	public void setEmpWage(int totalWage) {
		this.totalWage = totalWage;
	}
	@Override
	public String toString() {
		return "Total wage of employee of company " + this.company + " is: "+this.totalWage;
	}
	
}
