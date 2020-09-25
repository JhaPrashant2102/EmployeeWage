import java.lang.*;
import java.util.*;
public class EmpWageBuildUC8{
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	//public static final int PAY_PER_HOUR = 20;
	//public static final int NUM_OF_WORKING_DAYS = 20;
	//public static final int MAX_HRS_IN_MONTH = 100;

	public static int calculateEmpWage(String company, int PAY_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH){
		int empCheck, totalWage = 0;
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
		totalWage = totalEmpHour*PAY_PER_HOUR;
		System.out.println("Total Wage of employee of company "+company+" is: "+totalWage);
		return totalWage;
	}
	public static void main(String args[]){
		calculateEmpWage("Capgemini",100,25,200);
		calculateEmpWage("BridgeLabz",60,20,80);
	}
}
