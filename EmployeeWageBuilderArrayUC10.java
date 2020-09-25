import java.lang.*;
import java.util.*;
public class EmployeeWageBuilderArrayUC10 {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private int numOfCompanies = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmployeeWageBuilderArrayUC10() {
		companyEmpWageArray = new CompanyEmpWage[50];
	}

	private void addCompanyEmpWage(String company, int PAY_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
		companyEmpWageArray[numOfCompanies] = new CompanyEmpWage(company, PAY_PER_HOUR, NUM_OF_WORKING_DAYS,
				MAX_HRS_IN_MONTH);
		numOfCompanies++;
	}

	private void calculateEmpWage() {
		for (int i = 0; i < numOfCompanies; i++) {
			companyEmpWageArray[i].setEmpWage(this.calculateEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	private int calculateEmpWage(CompanyEmpWage objectX) {
		int empCheck;
		int dailyHour = 0, totalEmpHour = 0, totalWorkingDays = 0;
		while (totalEmpHour <= objectX.MAX_HRS_IN_MONTH && totalWorkingDays <= objectX.NUM_OF_WORKING_DAYS) {
			empCheck = new Random().nextInt(3);
			totalWorkingDays++;
			switch (empCheck) {
			case IS_FULL_TIME:
				dailyHour = 8;
				break;
			case IS_PART_TIME:
				dailyHour = 4;
				break;
			default:
				dailyHour = 0;
			}
			totalEmpHour += dailyHour;
			System.out.println("On day: " + totalWorkingDays + " the working hour is: " + dailyHour);
		}
		return totalEmpHour * objectX.PAY_PER_HOUR;

	}

	public static void main(String args[]) {
		EmployeeWageBuilderArrayUC10 wageBuilder = new EmployeeWageBuilderArrayUC10();
		wageBuilder.addCompanyEmpWage("Capgemini", 100, 25, 200);
		wageBuilder.addCompanyEmpWage("BridgLabz", 60, 20, 80);
		wageBuilder.calculateEmpWage();
	}
}
