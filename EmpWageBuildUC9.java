import java.lang.*;
import java.util.*;
public class EmpWageBuildUC9{
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	private final String company;
	private final int PAY_PER_HOUR;
	private final int NUM_OF_WORKING_DAYS;
	private final int MAX_HRS_IN_MONTH;
	private int totalWage;

	//public static final int PAY_PER_HOUR = 20;
	//public static final int NUM_OF_WORKING_DAYS = 20;
	//public static final int MAX_HRS_IN_MONTH = 100;
	public EmpWageBuildUC9(String company, int PAY_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH){
		this.company = company;
		this.PAY_PER_HOUR = PAY_PER_HOUR;
		this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
		this.totalWage = 0;
	}
	public void calculateEmpWage(){
		int empCheck;
		int dailyHour = 0, totalEmpHour = 0, totalWorkingDays = 0;	
		while(totalEmpHour<=MAX_HRS_IN_MONTH&&totalWorkingDays<=NUM_OF_WORKING_DAYS){
			empCheck = new Random().nextInt(3);
			totalWorkingDays++;
			switch(empCheck){
				case IS_FULL_TIME:
				dailyHour = 8;
				break;
				case IS_PART_TIME:
				dailyHour =  4;
				break;
				default:
				dailyHour = 0;
			}
			totalEmpHour+=dailyHour;
			System.out.println("On day: "+totalWorkingDays+" the working hour is: "+dailyHour);
		}
		this.totalWage = totalEmpHour*this.PAY_PER_HOUR;
		//System.out.println("Total Wage of employee of company "+company+" is: "+totalWage);

	}
	@Override
	public String toString(){
		return "Total wage of employee of company " + company + " is: "+this.totalWage;
	}
	public static void main(String args[]){
		EmpWageBuildUC9 capgemini = new EmpWageBuildUC9("Capgemini",100,25,200);
		EmpWageBuildUC9 bridgeLabz = new EmpWageBuildUC9("BridgeLabz",60,20,80);
		capgemini.calculateEmpWage();
		bridgeLabz.calculateEmpWage();
		System.out.println(capgemini);
		System.out.println(bridgeLabz);
	}
}
