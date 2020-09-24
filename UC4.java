import java.lang.*;
public class UC4{
	public static void main(String args[]){
		int rate_per_hour = 20;
		int daily_hours;
		int emp_wage;
		final int FTemployee = 1;
		final int PTemployee = 2;
		int presence_check = (int)Math.floor(Math.random()*10)%3;
		switch(presence_check){
			case FTemployee:
			daily_hours = 8;
			break;
			case PTemployee:
			daily_hours = 4;
			break;
			default:
			daily_hours =  0;
		}
		emp_wage = rate_per_hour*daily_hours;
		System.out.println("Emp Wage: "+emp_wage);
	}
}
